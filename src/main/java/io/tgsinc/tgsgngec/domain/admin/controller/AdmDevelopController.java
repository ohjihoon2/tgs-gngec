package io.tgsinc.tgsgngec.domain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/develop")
public class AdmDevelopController {


    /**
     * 관리자 페이지 - 
     * @return
     */
    @GetMapping("")
    public String admDevelop(){
        return "/page/user/develop/index";
    }
}
