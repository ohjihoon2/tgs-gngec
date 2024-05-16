package io.tgsinc.tgsgngec.domain.user.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserMainController {

    @GetMapping("/")
    public String main(HttpServletRequest request, Model model){

        return "/page/user/main/index";
    }
}
