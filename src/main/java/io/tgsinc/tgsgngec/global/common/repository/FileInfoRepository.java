package io.tgsinc.tgsgngec.global.common.repository;

import io.tgsinc.tgsgngec.global.common.entity.file.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo, Long> {

}
