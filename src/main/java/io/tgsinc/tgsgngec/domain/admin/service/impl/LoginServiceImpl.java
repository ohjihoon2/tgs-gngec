package io.tgsinc.tgsgngec.domain.admin.service.impl;

import io.tgsinc.tgsgngec.domain.admin.dto.UserDetailsDTO;
import io.tgsinc.tgsgngec.domain.admin.entity.Users;
import io.tgsinc.tgsgngec.domain.admin.repository.AdminRepository;
import io.tgsinc.tgsgngec.domain.admin.service.LoginService;
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
        Users user = adminRepository.findById(username);

        if (user == null) throw new UsernameNotFoundException("User not exist");

        return new UserDetailsDTO(user);
    }
}
