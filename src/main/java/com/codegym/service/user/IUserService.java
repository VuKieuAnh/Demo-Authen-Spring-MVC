package com.codegym.service.user;

import com.codegym.model.AppUser;
import com.codegym.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<AppUser>, UserDetailsService {
    Optional<AppUser> findByUsername(String username);
}
