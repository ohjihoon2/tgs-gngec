package io.tgsinc.tgsgngec.global.common.service;

import io.tgsinc.tgsgngec.global.common.dto.RsrchAsmtDTO;
import io.tgsinc.tgsgngec.domain.admin.search.ResearchSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RsrchAsmtService {
    Page<RsrchAsmtDTO> findAll(ResearchSearch search, Pageable pageable);
}
