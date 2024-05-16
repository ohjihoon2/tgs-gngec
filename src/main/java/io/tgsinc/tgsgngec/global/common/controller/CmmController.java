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
     * @methodName login
     * @author ohjihoon
     * @date 2024-05-16 오전 11:27
     * @description 로그인
     */
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("data", "Hello !");
        return "/login/login";
    }

    /**
     * @methodName accessDenied
     * @author ohjihoon
     * @date 2024-05-16 오전 11:27
     * @description 접근 거절
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
