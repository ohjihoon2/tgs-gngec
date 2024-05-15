package io.tgsinc.tgsgngec.global.common.dto;

import io.tgsinc.tgsgngec.global.common.entity.UsersEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class UserDetailsDTO implements UserDetails {

    private UsersEntity user;

    public UserDetailsDTO(UsersEntity usersEntity) {
        this.user = usersEntity;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(()-> "ROLE_"+user.getRole());
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPswdEncpt();
    }

    @Override
    public String getUsername() {
        return user.getId();
    }


    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
