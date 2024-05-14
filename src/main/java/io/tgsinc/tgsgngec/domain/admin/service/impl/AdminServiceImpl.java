package io.tgsinc.tgsgngec.domain.admin.service.impl;

import io.tgsinc.tgsgngec.domain.admin.entity.Users;
import io.tgsinc.tgsgngec.domain.admin.repository.AdminRepository;
import io.tgsinc.tgsgngec.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void addAdmin(Map<String, Object> paramMap) {

        Users user = Users.builder()
                .id(paramMap.get("id").toString())
                .pswdEncpt(passwordEncoder.encode((paramMap.get("pswd").toString())))
                .role(paramMap.get("role").toString())
                .build();
        adminRepository.save(user);
    }
}
