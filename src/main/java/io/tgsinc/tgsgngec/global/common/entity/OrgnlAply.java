package io.tgsinc.tgsgngec.global.common.entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "orgnl_aply")
@Comment("원본 신청")
public class OrgnlAply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORGNL_APLY_IDX")
    @Comment("원본 신청 IDX")
    private Long idx;

    @Column(name = "RSRCH_ASMT_IDX")
    @Comment("연구과제IDX")
    private Long rsrchAsmtIdx;

    @Column(name = "NM", length = 20)
    @Comment("이름")
    private String nm;

    @Column(name = "OGNZ", length = 100)
    @Comment("소속")
    private String ognz;

    @Column(name = "TELNO", length = 30)
    @Comment("전화번호")
    private String telNo;

    @Column(name = "EML", length = 40)
    @Comment("이메일")
    private String eml;

    @Column(name = "APLY_RSN", length = 1000)
    @Comment("신청사유")
    private String aplyRsn;

    @Column(name = "SNDNG_YN", length = 1)
    @Comment("발송여부")
    private Character sndngYn;

    @Column(name = "REG_DT")
    @Comment("등록일시")
    private LocalDateTime regDt;

}
