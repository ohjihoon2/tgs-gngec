package io.tgsinc.tgsgngec.global.common.repository;

import io.tgsinc.tgsgngec.global.common.entity.RsrchAsmt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RsrchAsmtRepository extends JpaRepository<RsrchAsmt, Long>, JpaSpecificationExecutor<RsrchAsmt> {

    Page<RsrchAsmt> findAll(Specification<RsrchAsmt> spec, Pageable pageable);
}
