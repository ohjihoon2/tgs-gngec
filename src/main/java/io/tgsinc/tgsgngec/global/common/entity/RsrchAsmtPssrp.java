package io.tgsinc.tgsgngec.global.common.entity;

import io.tgsinc.tgsgngec.global.common.enums.RsrchFldEnum;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "rsrch_asmt_pssrp")
@Comment("연구과제공모")
public class RsrchAsmtPssrp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RSRCH_ASMT_PSSRP_IDX")
    @Comment("연구과제공모IDX")
    private Long idx;

    @Column(name = "ASMT_NM")
    @Comment("과제명")
    private String asmtNm;

    @Column(name = "PROPSE_NM")
    @Comment("제안명")
    private String propseNm;

    @Column(name = "PIC_DEPT")
    @Comment("담당자부서")
    private String picDept;

    @Column(name = "PIC_NM")
    @Comment("담당자명")
    private String picNm;

    @Column(name = "PIC_JBGD")
    @Comment("담당자직급")
    private String picJbgd;

    @Column(name = "PIC_TELNO")
    @Comment("담당자전화번호")
    private String picTelno;

    @Column(name = "RSRCH_BGNG_DT")
    @Comment("연구시작일시")
    private LocalDateTime rsrchBgngDt;

    @Column(name = "RSRCH_END_DT")
    @Comment("연구종료일시")
    private LocalDateTime rsrchEndDt;

    @Column(name = "EXPECT_RSRCH_CT")
    @Comment("예상연구비용")
    private Integer expectRsrchCt;

    @Column(name = "RSRCH_FLD_ARRAY")
    @Enumerated(EnumType.STRING)
    @Comment("연구분야배열")
    private RsrchFldEnum rsrchFldArray;

    @Column(name = "WSTWT_PRCS_ARRAY")
    @Comment("하폐수처리배열")
    private String wstwtPrcsArray;

    @Column(name = "WTSUPLY_ARRAY")
    @Comment("상수도배열")
    private String wtsuplyArray;

    @Column(name = "QLTWTR_MNG_ARRAY")
    @Comment("수질관리배열")
    private String qltwtrMngArray;

    @Column(name = "NATURE_ENVRN_ARRAY")
    @Comment("자연환경배열")
    private String natureEnvrnArray;

    @Column(name = "WST_MNG_ARRAY")
    @Comment("폐기물관리배열")
    private String wstMngArray;

    @Column(name = "ATMS_MNG_ARRAY")
    @Comment("대기관리배열")
    private String atmsMngArray;

    @Column(name = "SOIL_UGRWTR_ARRAY")
    @Comment("토양지하수배열")
    private String soilUgrwtrArray;

    @Column(name = "ETC_ENVRN_ARRAY")
    @Comment("기타환경배열")
    private String etcEnvrnArray;

    @Column(name = "CLMT_CHNGE_CNTRMSR_ARRAY")
    @Comment("기후변화대응배열")
    private String clmtChngeCntrmsrArray;

    @Column(name = "RSRCH_PRPS")
    @Comment("연구목적")
    private String rsrchPrps;

    @Column(name = "RSRCH_CN")
    @Comment("연구내용")
    private String rsrchCn;

    @Column(name = "PLUE_METHOD")
    @Comment("활용방안")
    private String plueMethod;

    @Column(name = "PSWD")
    @Comment("패스워드")
    private String pswd;

    @OneToMany(mappedBy = "rsrchAsmtPssrp")
    private List<RsrchRbprsnAply> rsrchRbprsnAplys = new ArrayList<>();
}
