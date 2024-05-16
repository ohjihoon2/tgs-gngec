package io.tgsinc.tgsgngec.domain.admin.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * AdminMainController
 * @author ohjihoon
 * @version 1.0.0
 * @date 2024-05-16
 * @description 관리자 메인
 */ 
 
@Controller
@RequestMapping("/admin")
public class AdminMainController {

    /**
     * 관리자 페이지 메인
     * @param request
     * @param model
     * @return
     */
    @GetMapping("")
    public String main(HttpServletRequest request, Model model){

        return "/page/admin/main/index";
    }
}
