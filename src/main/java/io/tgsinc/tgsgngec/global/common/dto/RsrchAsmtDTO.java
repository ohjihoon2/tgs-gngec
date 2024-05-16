package io.tgsinc.tgsgngec.global.common.dto;

import io.tgsinc.tgsgngec.global.common.entity.BaseEntity;
import io.tgsinc.tgsgngec.global.common.entity.OrgnlAply;
import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import lombok.*;

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

//    private FileGroup sumryFileIdx;
//    private FileGroup orgnlFileIdx;

    private List<OrgnlAply> orgnlAplys = new ArrayList<>();

    public RsrchAsmtDTO(RsrchAsmt rsrchAsmt) {
        this.idx = rsrchAsmt.getIdx();
        this.rsrchYr = rsrchAsmt.getRsrchYr();
        this.rsrchNm = rsrchAsmt.getRsrchNm();
        this.cntrNm = rsrchAsmt.getCntrNm();
        this.rbprsnNm = rsrchAsmt.getRbprsnNm();
        this.orgnlAplys = rsrchAsmt.getOrgnlAplys();
    }
}
