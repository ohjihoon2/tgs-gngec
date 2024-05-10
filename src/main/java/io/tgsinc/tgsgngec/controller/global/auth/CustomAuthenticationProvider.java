package io.tgsinc.tgsgngec.controller.global.auth;

import io.tgsinc.tgsgngec.controller.domain.admin.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.ObjectUtils;

@RequiredArgsConstructor
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final LoginService loginService;
    private final PasswordEncoder passwordEncoder;

    /**
     * <p> The authenticate method to authenticate the request. We will get the username from the Authentication object and will
     * use the custom @userDetailsService service to load the given user.</p>
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        System.out.println("CustomAuthenticationProvider.authenticate");
        //username / password 가 유효한지 검사

        final String username = (authentication.getPrincipal() == null) ? "NONE_PROVIDED" : authentication.getName();
        System.out.println("username = " + username);
        // 1. username null check
        if (ObjectUtils.isEmpty(username)) {
            throw new BadCredentialsException("invalid login details");
        }

        // get user details using Spring security user details service
        UserDetails user = null;
        try {
            user = loginService.loadUserByUsername(username);
            String password = (String) authentication.getCredentials();
            String encodePassword = user.getPassword();

            if ( !passwordEncoder.matches(password, encodePassword)) {
                throw new BadCredentialsException("invalid login details");
            }
        } catch (UsernameNotFoundException exception) {
            throw new UsernameNotFoundException("invalid login details");
        }

        return createSuccessfulAuthentication(authentication, user);
    }

    private Authentication createSuccessfulAuthentication(final Authentication authentication, final UserDetails user) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(), authentication.getCredentials(), user.getAuthorities());
        return token;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }


}
