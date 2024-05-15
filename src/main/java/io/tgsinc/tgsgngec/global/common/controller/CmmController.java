package io.tgsinc.tgsgngec.global.common.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class CmmController {

    /**
     * 로그인
     * @param model
     * @return
     */
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("data", "Hello !");
        return "/login/login";
    }

    /**
     * 접근 거절
     * @param exception
     * @param model
     * @return
     */
    @GetMapping("/denied")
    public String accessDenied(@RequestParam(value = "exception",required = false) String exception,
                               Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("username",authentication.getPrincipal());
        model.addAttribute("exception",exception);

        return "/login/denied";
    }

}
