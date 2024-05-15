package io.tgsinc.tgsgngec.domain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/cmmnity")
public class AdmCommunityController {

    /**
     * 관리자 페이지 커뮤니티 탭
     * @return
     */
    @GetMapping("")
    public String adminCommunity(){
        return "/page/admin/community/index";
    }

}
