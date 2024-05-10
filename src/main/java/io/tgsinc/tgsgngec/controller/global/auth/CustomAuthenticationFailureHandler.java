package io.tgsinc.tgsgngec.controller.global.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;

@NoArgsConstructor
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

        @Override
        public void onAuthenticationFailure(HttpServletRequest request,
                                            HttpServletResponse response,
                                            AuthenticationException exception) throws IOException, ServletException {
            System.out.println("CustomAuthenticationFailureHandler.onAuthenticationFailure");

            //TODO 로그인 실패시 로직 추가

            String loginFailMsg = "";
            // 실패로그를 남긴다
             if(exception instanceof BadCredentialsException) {
                 loginFailMsg = "아이디 또는 비밀번호가 틀립니다.";

            } else if(exception instanceof LockedException) {
                 loginFailMsg = "잠긴 계정입니다.";

            } else if(exception instanceof DisabledException) {
                 loginFailMsg = "비활성화된 계정입니다.";

            } else if(exception instanceof AccountExpiredException) {
                 loginFailMsg = "만료된 계정입니다.";
            } else if(exception instanceof CredentialsExpiredException) {
                 loginFailMsg = "비밀번호가 만료되었습니다.";
            }

//            JSONObject jsonObj = new JSONObject();
//
//            jsonObj.put("result","fail");
//            jsonObj.put("message",loginFailMsg);
//
//            response.setContentType("application/json");
//            response.setCharacterEncoding("UTF-8");
//            response.getWriter().print(jsonObj);

        }
}
