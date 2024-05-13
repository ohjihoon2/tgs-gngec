package io.tgsinc.tgsgngec.controller.domain.user.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String main(HttpServletRequest request, Model model){
        model.addAttribute("data", "메인 페이지 !");
        return "/hello";
    }
}
