package io.tgsinc.tgsgngec.global.common.entity;
import io.tgsinc.tgsgngec.global.common.entity.file.FileGroup;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "rsrch_rbprsn_aply")
@Comment("연구 책임자 신청")
public class RsrchRbprsnAply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RSRCH_RBPRSN_APLY_IDX")
    @Comment("연구 책임자 신청 IDX")
    private Long idx;

    @Comment("연구 과제 공모 IDX")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RSRCH_ASMT_PSSRP_IDX")
    private RsrchAsmtPssrp rsrchAsmtPssrp;

    @Column(name = "APLY_STTS")
    @Comment("신청상태")
    private String aplyStts;

    @Column(name = "RSRCH_INST")
    @Comment("연구기관")
    private String rsrchInst;

    @Column(name = "ClBR_RSRCH_INST")
    @Comment("공동연구기관")
    private String clbrRschInst;

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

    /**
     *  단방향 관계
     */
    @Comment("첨부파일IDX")
    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL,orphanRemoval = false)
    @JoinColumn(name = "FILE_GROUP_IDX")
    private FileGroup fileGroup;

    @Column(name = "PSWD")
    @Comment("패스워드")
    private String pswd;


    /**
     * 연관 관계 편의 메서드 (순수 객체 상태를 고려해서 항상 양쪽에 값 설정)
     * @param rsrchAsmtPssrp
     */
    public void changeRsrchAsmtPssrp(RsrchAsmtPssrp rsrchAsmtPssrp) {
        this.rsrchAsmtPssrp = rsrchAsmtPssrp;
        rsrchAsmtPssrp.getRsrchRbprsnAplys().add(this);
    }

}
