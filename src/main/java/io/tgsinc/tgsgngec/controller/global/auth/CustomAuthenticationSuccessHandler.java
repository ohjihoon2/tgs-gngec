package io.tgsinc.tgsgngec.controller.global.auth;

import io.tgsinc.tgsgngec.controller.domain.admin.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import java.io.IOException;

public class CustomAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Autowired
    private LoginService loginService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        System.out.println("CustomAuthenticationSuccessHandler.onAuthenticationSuccess");
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String userId =  authentication.getPrincipal().toString();


        //TODO 로그인 성공 후 작업 세션에 데이터 저장

        HttpSession session = request.getSession();

//        Map<String, Object> sessionMap = loginService.findUserNicknmVerificationYnEmailIdxByUserId(userId);
//        session.setAttribute("idx", sessionMap.get("idx"));
//        session.setAttribute("userNicknm", sessionMap.get("userNicknm"));
//        session.setAttribute("verificationYn", sessionMap.get("verificationYn"));
//        session.setAttribute("userEmail", sessionMap.get("userEmail"));

//        JSONObject jsonObj = new JSONObject();
//
//        jsonObj.put("result","success");
//        jsonObj.put("message",null);
//
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        response.getWriter().print(jsonObj);
    }

}
