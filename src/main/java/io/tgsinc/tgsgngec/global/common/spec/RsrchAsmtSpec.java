package io.tgsinc.tgsgngec.global.common.spec;

import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import org.springframework.data.jpa.domain.Specification;

/**
 * 연구개발 연구과제 쿼리 조건
 */
public class RsrchAsmtSpec {

    public static Specification<RsrchAsmt> equalRsrchNm(String value) {
        return (root, query, cb) -> cb.like(root.get("rsrchNm"), "%"+ value + "%");
    }

    public static Specification<RsrchAsmt> equalRsrchYr(String value) {
        return (root, query, cb) -> cb.like(root.get("rsrchYr"), "%"+ value + "%");
    }

}
