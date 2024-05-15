package io.tgsinc.tgsgngec.domain.admin.service.impl;

import io.tgsinc.tgsgngec.global.common.entity.UsersEntity;
import io.tgsinc.tgsgngec.global.common.repository.LoginRepository;
import io.tgsinc.tgsgngec.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final LoginRepository loginRepository;
    private final PasswordEncoder passwordEncoder;

    /**
     * 유저 생성 테스트 코드
     * @param paramMap
     */
    @Override
    public void addUser(Map<String, Object> paramMap) {

        UsersEntity user = UsersEntity.builder()
                .id(paramMap.get("id").toString())
                .pswdEncpt(passwordEncoder.encode((paramMap.get("pswd").toString())))
                .role(paramMap.get("role").toString())
                .build();
        loginRepository.save(user);
    }
}
