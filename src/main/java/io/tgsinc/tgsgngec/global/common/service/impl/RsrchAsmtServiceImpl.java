package io.tgsinc.tgsgngec.global.common.service.impl;

import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import io.tgsinc.tgsgngec.global.common.repository.RsrchAsmtRepository;
import io.tgsinc.tgsgngec.global.common.service.RsrchAsmtService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RsrchAsmtServiceImpl implements RsrchAsmtService {

    private final RsrchAsmtRepository rsrchAsmtRepository;

    @Override
    public Page<RsrchAsmt> findAll(Pageable pageable) {
        return rsrchAsmtRepository.findAll(pageable);
    }
}
