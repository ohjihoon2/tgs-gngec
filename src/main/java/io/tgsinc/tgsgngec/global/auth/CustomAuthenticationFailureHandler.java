package io.tgsinc.tgsgngec.global.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@NoArgsConstructor
public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

        @Override
        public void onAuthenticationFailure(HttpServletRequest request,
                                            HttpServletResponse response,
                                            AuthenticationException exception) throws IOException, ServletException {

            String loginFailMsg = "";
            if(exception instanceof UsernameNotFoundException) {
                loginFailMsg = "아이디 또는 비밀번호가 틀립니다.";

            } else if(exception instanceof BadCredentialsException) {
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

            setDefaultFailureUrl("/login?exception=" + URLEncoder.encode(loginFailMsg, StandardCharsets.UTF_8));

            super.onAuthenticationFailure(request, response, exception);

        }
}
