package com.Banking.bank_management.reposiotary;

import com.Banking.bank_management.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
    User findByUser(String user);
}
