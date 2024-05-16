package io.tgsinc.tgsgngec.global.common;

import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import org.springframework.data.jpa.domain.Specification;



public class RsrchAsmtSpec {

    public static Specification<RsrchAsmt> equalRsrchNm(String rsrchNm) {
        return (root, query, cb) -> cb.like(root.get("rsrchNm"), "%"+ rsrchNm + "%");
    }

    public static Specification<RsrchAsmt> equalRsrchYr(String rsrchYr) {
        return (root, query, cb) -> cb.like(root.get("rsrchYr"), "%"+ rsrchYr + "%");
    }

}
