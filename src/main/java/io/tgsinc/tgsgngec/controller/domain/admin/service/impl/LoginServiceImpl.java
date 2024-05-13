package io.tgsinc.tgsgngec.controller.domain.admin.service.impl;

import io.tgsinc.tgsgngec.controller.domain.admin.dto.UserDetailsDTO;
import io.tgsinc.tgsgngec.controller.domain.admin.entity.Users;
import io.tgsinc.tgsgngec.controller.domain.admin.repository.AdminRepository;
import io.tgsinc.tgsgngec.controller.domain.admin.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = adminRepository.findByUsername(username);

        if (user == null) throw new UsernameNotFoundException("User not exist");

        return new UserDetailsDTO(user);
    }
}
