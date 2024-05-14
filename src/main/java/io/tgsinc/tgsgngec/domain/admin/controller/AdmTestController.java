package io.tgsinc.tgsgngec.domain.admin.controller;

import io.tgsinc.tgsgngec.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class AdmTestController {

    private final AdminService adminService;

    @GetMapping("/adm")
    public String adminMain(){
        return "/admin/main";
    }

    @GetMapping("/adm/test")
    public String adminTest(){
        return "/admin/test";
    }

    @PostMapping("/add")
    public void add(@RequestBody Map<String, Object> paramMap){

        adminService.addAdmin(paramMap);
    }
}
