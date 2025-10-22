package com.Banking.bank_management.service;

import com.Banking.bank_management.dto.Candidate;
import com.Banking.bank_management.reposiotary.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tran {
    @Autowired
    private CandidateRepo candidateRepo;

    public Candidate findByac(Long ac){
        return candidateRepo.findByAc(ac);
    }


    public Candidate save(Candidate candidate){
        return candidateRepo.save(candidate);
    }

    public String credit(Long ac,Double amount){
        Candidate cd = findByac(ac);
        Double balance = cd.getBalance();
        cd.setBalance(balance+amount);
        candidateRepo.save(cd);
        Long ref = (long) (Math.random()*1000000000);

        return ref.toString();
    }
    public String debit(Long ac,Double amount){
        Candidate cd = findByac(ac);
        Double balance = cd.getBalance();
        cd.setBalance(balance-amount);
        candidateRepo.save(cd);
        Long ref = (long) (Math.random()*1000000000);
        return ref.toString();
    }
}
