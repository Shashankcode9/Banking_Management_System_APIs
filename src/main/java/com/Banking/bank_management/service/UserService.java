package com.Banking.bank_management.service;

import com.Banking.bank_management.dto.User;
import com.Banking.bank_management.Security.password;
import com.Banking.bank_management.reposiotary.UserRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User findByUser(String user){
        return userRepo.findByUser(user);
    }
    public User save(User user){
        return userRepo.save(user);
    }

    public boolean signin(User user){
        User u = userRepo.findByUser(user.getUser());
        String pas = password.decoding(user.getPassword());
        String pa = password.decoding(u.getPassword());
        return pas.equals(pa);
    }
}
