package com.Banking.bank_management.reposiotary;

import com.Banking.bank_management.dto.T_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface THistoryRepo extends JpaRepository<T_History,Integer> {

}
