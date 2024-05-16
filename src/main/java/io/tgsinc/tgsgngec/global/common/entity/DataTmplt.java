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
@Table(name = "data_tmplt")
@Comment("자료 서식")
public class DataTmplt extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DATA_TMPLT_IDX")
    @Comment("자료 서식 IDX")
    private Long idx;

    @Column(name = "TYPE")
    @Comment("유형")
    private String type;

    @Column(name = "TTL")
    @Comment("제목")
    private String ttl;

    @Column(name = "CN")
    @Comment("내용")
    private String cn;

    @Column(name = "INQ_CNT")
    @Comment("조회수")
    private Integer inqCnt;

    @Column(name = "ATCH_FILE_IDX")
    @Comment("첨부파일IDX")
    private Long atchFileIdx;

}
