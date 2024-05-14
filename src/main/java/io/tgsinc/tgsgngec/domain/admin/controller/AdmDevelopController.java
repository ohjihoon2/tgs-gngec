package io.tgsinc.tgsgngec.domain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm/develop")
public class AdmDevelopController {


    @GetMapping("")
    public String admDevelop(){
        return "/page/user/develop/index";
    }
}
