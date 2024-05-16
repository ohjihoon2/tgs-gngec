package io.tgsinc.tgsgngec.domain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AdminCommunityController
 * @author ohjihoon
 * @version 1.0.0
 * @date 2024-05-16
 * @description 관리자 커뮤니티
 */

@Controller
@RequestMapping("/admin/cmmnity")
public class AdminCommunityController {

    /**
     * @methodName adminCommunity
     * @author ohjihoon
     * @date 2024-05-16 오전 11:23
     * @description 관리자 페이지 커뮤니티 탭
     */

    @GetMapping("")
    public String adminCommunity(){
        return "/page/admin/community/index";
    }

}
