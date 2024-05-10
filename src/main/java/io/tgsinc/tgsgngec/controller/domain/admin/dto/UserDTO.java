package io.tgsinc.tgsgngec.controller.domain.admin.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long idx;

    private String username;

    private String password;

    private String role;

}
