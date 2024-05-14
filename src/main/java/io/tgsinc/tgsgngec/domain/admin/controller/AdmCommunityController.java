package io.tgsinc.tgsgngec.domain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm/cmmnity")
public class AdmCommunityController {

    @GetMapping("")
    public String adminCommunity(){
        return "/page/community/index";
    }

}
