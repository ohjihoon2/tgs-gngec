package io.tgsinc.tgsgngec.global.common.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "rsrch_asmt")
@Comment("연구 과제")
public class RrsrchAsmtEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX")
    @Comment("IDX")
    private Long idx;

    @Column(name = "RSRCH_YR")
    @Comment("연구연도")
    private String rsrchYr;

    @Column(name = "RSRCH_NM")
    @Comment("연구명")
    private String rsrchNm;

    @Column(name = "CNTR_NM")
    @Comment("센터명")
    private String cntrNm;

    @Column(name = "RBPRSN_NM")
    @Comment("책임자명")
    private String rbprsnNm;

    @Column(name = "SUMRY_FILE_IDX")
    @Comment("요약파일IDX")
    private Long sumryFileIdx;

    @Column(name = "ORGNL_FILE_IDX")
    @Comment("원본파일IDX")
    private Long orgnlFileIdx;

    @Column(name = "REG_DT")
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("등록일시")
    private Date regDt;

    @Column(name = "REG_UIDX")
    @Comment("등록UIDX")
    private Long regUidx;

    @Column(name = "MDFCN_DT")
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("수정일시")
    private Date mdfcnDt;

    @Column(name = "MDFCN_UIDX")
    @Comment("수정UIDX")
    private Long mdfcnUidx;

}
