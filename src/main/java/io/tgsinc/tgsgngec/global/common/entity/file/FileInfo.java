package io.tgsinc.tgsgngec.global.common.entity.file;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "file_info")
public class FileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILE_INFO_IDX")
    @Comment("파일 그룹 IDX")
    private Long idx;

    @Comment("파일 그룹 IDX")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FILE_GROUP_IDX")
    private FileGroup fileGroup;

    @Column(name = "SN")
    @Comment("순번")
    private Integer sn;

    @Column(name = "ORGNL_NM")
    @Comment("원본명")
    private String orgnlNm;

    @Column(name = "STRG_NM")
    @Comment("저장명")
    private String strgNm;

    @Column(name = "STRG_PATH")
    @Comment("저장경로")
    private String strgPath;

    @Column(name = "DWNLD_PATH")
    @Comment("다운로드경로")
    private String dwnldPath;

    @Column(name = "SZ")
    @Comment("크기")
    private Long sz;

    @Column(name = "EXTN")
    @Comment("확장자")
    private String extn;

    @Column(name = "CRT_UIDX")
    @Comment("생성UIDX")
    private Integer crtUidx;

    @Column(name = "CRT_DT")
    @Comment("생성일시")
    private LocalDateTime crtDt;


    public void updateFileGroup(FileGroup fileGroup){
        this.fileGroup = fileGroup;

    }

}
