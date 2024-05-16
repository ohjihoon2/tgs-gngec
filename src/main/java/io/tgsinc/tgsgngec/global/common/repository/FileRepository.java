package io.tgsinc.tgsgngec.global.common.repository;

import io.tgsinc.tgsgngec.global.common.entity.file.Files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<Files, Long> {

}
