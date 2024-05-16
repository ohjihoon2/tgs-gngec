package io.tgsinc.tgsgngec.global.common.entity.community;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "qna")
@Comment("QnA")
public class Qna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX")
    @Comment("IDX")
    private Long idx;

    @Column(name = "TTL")
    @Comment("제목")
    private String ttl;

    @Column(name = "QSTN_CN")
    @Comment("질문내용")
    private String qstnCn;

    @Column(name = "ANS_CN")
    @Comment("답변내용")
    private String ansCn;

    @Column(name = "ATCH_FILE_IDX")
    @Comment("첨부파일IDX")
    private Long atchFileIdx;

    @Column(name = "SECRET_YN")
    @Comment("비밀여부")
    private Character secretYn;

    @Column(name = "PSWD")
    @Comment("비밀번호")
    private String pswd;

    @Column(name = "REG_DT")
    @Comment("등록일시")
    private LocalDateTime regDt;

    @Column(name = "ANS_UIDX")
    @Comment("답변UIDX")
    private Long ansUidx;

    @Column(name = "ANS_DT")
    @Comment("답변일시")
    private LocalDateTime ansDt;
}
