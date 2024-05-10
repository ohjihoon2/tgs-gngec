package io.tgsinc.tgsgngec.controller.global.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CmmController {

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("data", "Hello !");
        return "/hello";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("data", "Hello !");
        return "/login/login";
    }

}
