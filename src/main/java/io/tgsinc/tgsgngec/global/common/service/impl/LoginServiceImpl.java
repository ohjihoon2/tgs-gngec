package io.tgsinc.tgsgngec.global.common.service.impl;

import io.tgsinc.tgsgngec.global.common.dto.UserDetailsDTO;
import io.tgsinc.tgsgngec.global.common.entity.Users;
import io.tgsinc.tgsgngec.global.common.repository.LoginRepository;
import io.tgsinc.tgsgngec.global.common.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = loginRepository.findById(username);

        if (user == null) throw new UsernameNotFoundException("User not exist");

        return new UserDetailsDTO(user);
    }
}
