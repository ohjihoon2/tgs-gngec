package io.tgsinc.tgsgngec.controller.domain.admin.controller;

import io.tgsinc.tgsgngec.controller.domain.admin.entity.Users;
import io.tgsinc.tgsgngec.controller.domain.admin.repository.AdminRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class AdminControllerTest {
    @Autowired
    AdminRepository adminRepository;



    @Test
    public void insertAdmin(){

        Users user = Users.builder()
                .username("test")
                .password("1234")
                .role("ADMIN")
                .build();

        adminRepository.save(user);

    }
}