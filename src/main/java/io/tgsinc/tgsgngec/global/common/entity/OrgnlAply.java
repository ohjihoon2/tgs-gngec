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

    @Comment("연구과제IDX")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RSRCH_ASMT_IDX")
    private RsrchAsmt rsrchAsmt;

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

    /**
     * 연관 관계 편의 메서드 (순수 객체 상태를 고려해서 항상 양쪽에 값 설정)
     * @param rsrchAsmt
     */
    public void changeRsrchAsmt(RsrchAsmt rsrchAsmt) {
        this.rsrchAsmt = rsrchAsmt;
        rsrchAsmt.getOrgnlAplys().add(this);
    }
}
