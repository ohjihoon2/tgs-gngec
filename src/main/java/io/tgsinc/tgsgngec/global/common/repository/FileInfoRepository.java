package io.tgsinc.tgsgngec.global.common.repository;

import io.tgsinc.tgsgngec.global.common.entity.file.FileGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileGroup, Long> {

}
