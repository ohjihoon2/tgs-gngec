package io.tgsinc.tgsgngec.global.util;

import io.tgsinc.tgsgngec.global.common.dto.file.FileDTO;
import io.tgsinc.tgsgngec.global.common.entity.file.FileGroup;
import io.tgsinc.tgsgngec.global.common.entity.file.FileInfo;
import io.tgsinc.tgsgngec.global.common.repository.FileInfoRepository;
import io.tgsinc.tgsgngec.global.common.repository.FileRepository;
import io.tgsinc.tgsgngec.global.exception.CustomErrorCode;
import io.tgsinc.tgsgngec.global.exception.CustomException;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
@RequiredArgsConstructor
public class FileUtil {

      /** 업로드 경로 */
    @Value("${resources.location}")
    private String resourcesLocation;

    private final FileInfoRepository fileInfoRepository;
    private final FileRepository fileRepository;

    private final String getRandomString(){
        return UUID.randomUUID().toString().replace("-","");
    }

    public List<FileDTO> uploadFiles(MultipartFile[] files, int attachFileIdx, int crtUidx){

        Date crtDt = new Date();
        String day = (new SimpleDateFormat("yyyy-MM-dd").format(crtDt)); //년도
        int cnt = 0;
        /* 파일이 비어있으면 비어있는 리스트 반환 */
        if(files[0].getSize() <1){
            return Collections.emptyList();
        }

        /* 업로드 파일 정보를 담을 비어있는 리스트 */
        List<FileDTO> fileList= new ArrayList<>();

        /* uploadPath에 해당하는 디렉터리가 존재하지 않으면, 부모 디렉터리를 포함한 모든 디렉터리를 생성 */
        String uploadPath = resourcesLocation + day;

        File dir = new File(uploadPath+"/");

        if(dir.exists() == false){
            dir.mkdirs();
        }

        if(attachFileIdx != 0 ){
            //todo sn 최대값 가져오기 수정중
            cnt = fileRepository.findTopSnByIdx(attachFileIdx);
        }

        /* 파일 개수만큼 forEach 실행 */
        for(MultipartFile file : files) {
            cnt++;
            try {
                /* 파일 확장자 */
                final String extn = FilenameUtils.getExtension(file.getOriginalFilename());
                /* 서버에 저장할 파일명 (랜덤 문자열 + 확장자) */
                final String strgNm = getRandomString();
                /* 업로드 경로에 strgNm과 동일한 이름을 가진 파일 생성 */
                File target = new File(uploadPath + "/", strgNm);
                System.out.println("target = " + target);
                file.transferTo(target);


                /* 파일 정보 저장 */
                FileDTO fileDTO = FileDTO.builder()
                        .sn(cnt)
                        .orgnlNm(file.getOriginalFilename())
                        .strgNm(strgNm)
                        .strgPath(uploadPath)
                        .sz(file.getSize())
                        .extn(extn)
                        .crtUidx(crtUidx).build();

                fileList.add(fileDTO);

            } catch (IOException e) {
                throw new CustomException(CustomErrorCode.FAILED_TO_SAVE_FILE);
            } catch (Exception e) {
                throw new CustomException(CustomErrorCode.FAILED_TO_SAVE_FILE);
            }
        }

        return fileList;
    }

    /**
     * 파일 저장 (저장 로직)
     * @param fileList
     * @return
     */
    public FileGroup saveFile(List<FileDTO> fileList) {
        Long idx = 0L;

        FileGroup fileGroup = null;
        List<FileInfo> files = new ArrayList<>();
        if (CollectionUtils.isEmpty(fileList) == false) {

            fileGroup = FileGroup.builder().build();
            fileInfoRepository.save(fileGroup);

            for (FileDTO fileDTO : fileList) {
                FileInfo file = fileDTO.toEntity();
                file.updateFileGroup(fileGroup);

                files.add(file);
            }

            fileRepository.saveAll(files);
        }

        return fileGroup;
    }

    //todo 파일 다운로드 처리
/*

    public void downloadFile(AttachFile file, HttpServletResponse response) throws IOException {
        String saveFileName = file.getStrgNm();
        String originalFileName = file.getOrgnlNm();
        String streCours = file.getStrgPath();

        File downloadFile = new File( streCours +"/"+saveFileName);

        byte fileByte[] = FileUtils.readFileToByteArray(downloadFile);

        response.setContentType("application/octet-stream");
        response.setContentLength(fileByte.length);

        response.setHeader("Content-Disposition", "attachment; fileName=\"" + URLEncoder.encode(originalFileName,"UTF-8") +"\";");
        response.setHeader("Content-Transfer-Encoding", "binary");

        response.getOutputStream().write(fileByte);
        response.getOutputStream().flush();
        response.getOutputStream().close();

    }
*/

    public boolean deleteRealFile(String saveFileName){
        //현재 게시판에 존재하는 파일객체를 만듬
        File file = new File(resourcesLocation + "\\" + saveFileName);

        if(file.exists()) { // 파일이 존재하면
            file.delete();
            // 파일 삭제
        }

        return true;

    }
}
