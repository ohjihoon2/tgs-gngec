package io.tgsinc.tgsgngec.global.common.service.impl;

import io.tgsinc.tgsgngec.global.common.spec.RsrchAsmtSpec;
import io.tgsinc.tgsgngec.global.common.dto.RsrchAsmtDTO;
import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import io.tgsinc.tgsgngec.global.common.repository.RsrchAsmtRepository;
import io.tgsinc.tgsgngec.domain.admin.search.ResearchSearch;
import io.tgsinc.tgsgngec.global.common.service.RsrchAsmtService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RsrchAsmtServiceImpl implements RsrchAsmtService {

    private final RsrchAsmtRepository rsrchAsmtRepository;

    @Override
    public Page<RsrchAsmtDTO> findAll(ResearchSearch search, Pageable pageable) {

        Specification<RsrchAsmt> spec = (root, query, criteriaBuilder) -> null;

        if(search.getSearchType().equals("rsrchNm")){
            spec = spec.and(RsrchAsmtSpec.equalRsrchNm(search.getKeyword()));
        }
        if(search.getRsrchYr() != null && !search.getRsrchYr().isEmpty()){
            spec = spec.and(RsrchAsmtSpec.equalRsrchYr(search.getRsrchYr()));
        }


        return  rsrchAsmtRepository.findAll(spec,pageable)
                .map(RsrchAsmtDTO::new);

    }
}
