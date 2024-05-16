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
@Table(name = "ntc")
@Comment("공지")
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NTC_IDX")
    @Comment("공지 IDX")
    private Long idx;

    @Column(name = "TYPE")
    @Comment("유형")
    private String type;

    @Column(name = "TTL")
    @Comment("제목")
    private String ttl;

    @Column(name = "CN", columnDefinition = "MEDIUMTEXT")
    @Comment("내용")
    private String cn;

    @Column(name = "INQ_CNT")
    @Comment("조회수")
    private Integer inqCnt;

    @Column(name = "ATCH_FILE_IDX")
    @Comment("첨부파일IDX")
    private Long atchFileIdx;

    @Column(name = "REG_DT")
    @Comment("등록일시")
    private LocalDateTime regDt;

    @Column(name = "REG_UIDX")
    @Comment("등록UIDX")
    private Long regUidx;
}
