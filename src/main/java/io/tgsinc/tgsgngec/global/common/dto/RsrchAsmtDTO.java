package io.tgsinc.tgsgngec.global.common.dto;

import io.tgsinc.tgsgngec.global.common.entity.BaseEntity;
import io.tgsinc.tgsgngec.global.common.entity.OrgnlAply;
import io.tgsinc.tgsgngec.global.common.entity.file.FileGroup;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class RsrchAsmtDTO extends BaseEntity {

    private Long idx;

    private String rsrchYr;

    private String rsrchNm;

    private String cntrNm;

    private String rbprsnNm;

//    @Comment("요약파일IDX")
//    private FileGroup sumryFileIdx;
//
//    @Comment("원본파일IDX")
//    private FileGroup orgnlFileIdx;

    private List<OrgnlAply> OrgnlAplys = new ArrayList<>();

}
