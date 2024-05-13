package io.tgsinc.tgsgngec.controller.domain.admin.repository;

import io.tgsinc.tgsgngec.controller.domain.admin.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String username);
}
