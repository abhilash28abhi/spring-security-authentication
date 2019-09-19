package com.spring.security.service;

import com.spring.security.model.MyUserDetails;
import com.spring.security.model.UserEntity;
import com.spring.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> entityOptional = userRepository.findByUsername(username);
        entityOptional.orElseThrow(() -> new UsernameNotFoundException("User name not found" + username));
        return entityOptional.map(e -> new MyUserDetails(e)).get();
    }
}
