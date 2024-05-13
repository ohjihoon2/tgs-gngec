package io.tgsinc.tgsgngec.controller.domain.admin.service.impl;

import io.tgsinc.tgsgngec.controller.domain.admin.entity.Users;
import io.tgsinc.tgsgngec.controller.domain.admin.repository.AdminRepository;
import io.tgsinc.tgsgngec.controller.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void addAdmin() {



        Users user = Users.builder()
                .username("user")
                .password(passwordEncoder.encode(("1234")))
                .role("USER")
                .build();


        adminRepository.save(user);
    }
}
