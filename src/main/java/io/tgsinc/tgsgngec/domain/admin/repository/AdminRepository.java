package io.tgsinc.tgsgngec.domain.admin.repository;

import io.tgsinc.tgsgngec.domain.admin.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Users, Long> {

    Users findById(String username);
}
