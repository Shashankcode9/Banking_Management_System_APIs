package com.Banking.bank_management.controller;

import com.Banking.bank_management.dto.Candidate;
import com.Banking.bank_management.reposiotary.CandidateRepo;
import com.Banking.bank_management.service.Tran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewAccountController {

    @Autowired
    private Tran tran;

    @Autowired
    private CandidateRepo candidateRepo;

    @GetMapping("/new")
    public String ne(){
        return "Account";
    }
    @PostMapping("/newAc")
    public String newAc(@ModelAttribute Candidate candidate, Model model){
        tran.save(candidate);
        model.addAttribute("ref","Welcome to new Account : "+candidate.getAc());
        return "thank";
    }

}
