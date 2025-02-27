package com.rashi.security.rbac.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRquest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;

}
