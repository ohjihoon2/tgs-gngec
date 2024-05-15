package io.tgsinc.tgsgngec.controller.domain.admin.controller;

import io.tgsinc.tgsgngec.domain.admin.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;


@SpringBootTest
class AdmTestControllerTest {

    @Autowired
    AdminService adminService;


    @Test
    void test(){

        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("id", "tset1");
        paramMap.put("pswd", "1234");
        paramMap.put("role", "ADMIN");

        adminService.addUser(paramMap);
    }
}