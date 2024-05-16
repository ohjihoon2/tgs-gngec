package io.tgsinc.tgsgngec.domain.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AdminDevelopController
 * @author ohjihoon
 * @version 1.0.0
 * @date 2024-05-16
 * @description 관리자 연구개발 탭
 */
@Controller
@RequestMapping("/admin/develop")
public class AdminDevelopController {


    /**
     * @methodName admDevelop
     * @author ohjihoon
     * @date 2024-05-16 오전 11:24
     * @description 연구개발 index
     */
    @GetMapping("")
    public String admDevelop(){
        return "/page/admin/develop/index";
    }
}
