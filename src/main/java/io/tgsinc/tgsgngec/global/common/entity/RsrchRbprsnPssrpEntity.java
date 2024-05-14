package io.tgsinc.tgsgngec.global.common.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Entity
@Table(name = "rsrch_rbprsn_pssrp")
@Comment("연구 책임자 공모")
public class RsrchRbprsnPssrpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX")
    @Comment("IDX")
    private Long idx;

    @Column(name = "ASMT_NO")
    @Comment("과제번호")
    private String asmtNo;

    @Column(name = "ASMT_NM")
    @Comment("과제명")
    private String asmtNm;

    @Column(name = "RSRCH_BGNG_DT")
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("연구시작일시")
    private Date rsrchBgngDt;

    @Column(name = "RSRCH_END_DT")
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("연구종료일시")
    private Date rsrchEndDt;

    @Column(name = "MXMM_PTCT_NMPR")
    @Comment("최대참여인원")
    private int mxmmPtctNmpr;

    @Column(name = "WAIT_NMPR")
    @Comment("대기인원")
    private int waitNmpr;

    @Column(name = "APLY_BGNG_DT")
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("신청시작일시")
    private Date aplyBgngDt;

    @Column(name = "APLY_END_DT")
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("신청종료일시")
    private Date aplyEndDt;

    @Column(name = "RSRCH_PJTCO")
    @Comment("연구사업비")
    private int rsrchPjtco;

    @Column(name = "ATCH_FILE_IDX")
    @Comment("첨부파일IDX")
    private Long atchFileIdx;

}
