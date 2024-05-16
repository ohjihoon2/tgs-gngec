package io.tgsinc.tgsgngec.global.common.service;

import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RsrchAsmtService {
    Page<RsrchAsmt> findAll(Pageable pageable);
}
