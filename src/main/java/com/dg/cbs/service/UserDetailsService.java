package com.dg.cbs.service;

import com.dg.cbs.entity.UserDetails;
import com.dg.cbs.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void saveUserDetails(UserDetails userDetails) {
        userDetailsRepository.saveUserDetails(userDetails);
    }

    public UserDetails findByUserName(String name) {
        return userDetailsRepository.findByUserName(name);
    }

    public List<UserDetails> getAllDriverDetails() {
        return userDetailsRepository.getAllUser();
    }
}
