package io.tgsinc.tgsgngec.controller.domain.admin.service.impl;

import io.tgsinc.tgsgngec.controller.domain.admin.entity.Users;
import io.tgsinc.tgsgngec.controller.domain.admin.repository.AdminRepository;
import io.tgsinc.tgsgngec.controller.domain.admin.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("LoginServiceImpl.loadUserByUsername");
        Users userDTO = adminRepository.findByUsername(username);



        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));


        return new org.springframework.security.core.userdetails.User(userDTO.getUsername(), userDTO.getPassword(), authorities);
    }
}
