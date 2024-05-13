package io.tgsinc.tgsgngec.controller.domain.admin.controller;

import io.tgsinc.tgsgngec.controller.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/admin")
    public String adminMain(){
        return "/admin/main";
    }

    @GetMapping("/admin/test")
    public String adminTest(){
        return "/admin/test";
    }

    @PostMapping("/add")
    public void add(){

        adminService.addAdmin();
    }
}
