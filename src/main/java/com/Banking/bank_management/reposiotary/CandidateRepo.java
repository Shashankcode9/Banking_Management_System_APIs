package com.Banking.bank_management.reposiotary;

import com.Banking.bank_management.dto.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate,Long> {


    Candidate findByAc(Long ac);
}
