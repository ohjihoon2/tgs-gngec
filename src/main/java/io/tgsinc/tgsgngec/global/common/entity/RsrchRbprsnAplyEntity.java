package io.tgsinc.tgsgngec.global.common.entity;
import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "rsrch_rbprsn_aply")
@Comment("연구 책임자 신청")
public class RsrchRbprsnAplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX")
    @Comment("IDX")
    private Long idx;

    @Column(name = "RSRCH_RBPRSN_PSSRP_IDX")
    @Comment("연구책임자공모IDX")
    private Long rsrchRbprsnPssrpIdx;

    @Column(name = "APLY_STTS")
    @Comment("신청상태")
    private String aplyStts;

    @Column(name = "RSRCH_INST")
    @Comment("연구기관")
    private String rsrchInst;

    @Column(name = "ClBR_RSRCH_INST")
    @Comment("공동연구기관")
    private String clbrRsrchInst;

    @Column(name = "JBPS")
    @Comment("직위")
    private String jbps;

    @Column(name = "OGNZ")
    @Comment("조직")
    private String ognz;

    @Column(name = "NM")
    @Comment("이름")
    private String nm;

    @Column(name = "TELNO")
    @Comment("전화번호")
    private String telno;

    @Column(name = "ATCH_FILE_IDX")
    @Comment("첨부파일IDX")
    private Long atchFileIdx;

    @Column(name = "PSWD")
    @Comment("패스워드")
    private String pswd;

}
