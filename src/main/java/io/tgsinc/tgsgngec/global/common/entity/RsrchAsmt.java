package io.tgsinc.tgsgngec.global.common.entity;

import io.tgsinc.tgsgngec.global.common.entity.file.FileGroup;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "rsrch_asmt")
@Comment("연구 과제")
public class RsrchAsmt {
//        extends BaseEntity {

    public RsrchAsmt(String rsrchYr, String rsrchNm) {
        this.rsrchYr = rsrchYr;
        this.rsrchNm = rsrchNm;
    }

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

//    @Comment("요약파일IDX")
//    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "idx",optional = false)
//    private FileGroup sumryFileIdx;
//
//    @Comment("원본파일IDX")
//    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "idx",optional = false)
//    private FileGroup orgnlFileIdx;

    @OneToMany(mappedBy = "rsrchAsmt")
    private List<OrgnlAply> OrgnlAplys = new ArrayList<>();

}
