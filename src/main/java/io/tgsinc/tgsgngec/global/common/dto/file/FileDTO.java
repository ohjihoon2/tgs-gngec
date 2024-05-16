package io.tgsinc.tgsgngec.global.common.dto.file;

import io.tgsinc.tgsgngec.global.common.entity.file.FileInfo;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FileDTO {

    private Long idx;

    /**
     * TODO 체크 예정
     * 파일 그룹 idx
     */
    private Long fileInfoIdx;

    private Integer sn;

    private String orgnlNm;

    private String strgNm;

    private String strgPath;

    private String dwnldPath;

    private Long sz;

    private String extn;

    private Integer crtUidx;

    private LocalDateTime crtDt;

    public FileInfo toEntity() {
        return FileInfo.builder()
//                .fileInfoIdx(fileInfoIdx)
                .sn(sn)
                .orgnlNm(orgnlNm)
                .strgNm(strgNm)
                .strgPath(strgPath)
                .dwnldPath(dwnldPath)
                .sz(sz)
                .extn(extn)
                .crtUidx(crtUidx)
                .crtDt(crtDt)
                .build();
    }

}
