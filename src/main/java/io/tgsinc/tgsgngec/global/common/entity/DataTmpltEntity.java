package io.tgsinc.tgsgngec.global.common.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Entity
@Table(name = "data_tmplt")
@Comment("자료 서식")
public class DataTmpltEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX")
    @Comment("IDX")
    private Long idx;

    @Column(name = "TYPE")
    @Comment("유형")
    private String type;

    @Column(name = "TTL")
    @Comment("제목")
    private String ttl;

    @Column(name = "CN")
    @Comment("내용")
    private String cn;

    @Column(name = "INQ_CNT")
    @Comment("조회수")
    private Integer inqCnt;

    @Column(name = "ATCH_FILE_IDX")
    @Comment("첨부파일IDX")
    private Long atchFileIdx;

    @Column(name = "REG_DT")
    @Comment("등록일시")
    private Date regDt;

    @Column(name = "REG_UIDX")
    @Comment("등록UIDX")
    private Long regUidx;
}
