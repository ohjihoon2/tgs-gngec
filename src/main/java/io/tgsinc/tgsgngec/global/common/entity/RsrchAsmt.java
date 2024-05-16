package io.tgsinc.tgsgngec.global.common.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "rsrch_asmt")
@Comment("연구 과제")
public class RsrchAsmt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RSRCH_ASMT_IDX")
    @Comment("연구 과제 IDX")
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
    @Comment("등록일시")
    private LocalDateTime regDt;

    @Column(name = "REG_UIDX")
    @Comment("등록UIDX")
    private Long regUidx;

    @Column(name = "MDFCN_DT")
    @Comment("수정일시")
    private LocalDateTime mdfcnDt;

    @Column(name = "MDFCN_UIDX")
    @Comment("수정UIDX")
    private Long mdfcnUidx;

}
