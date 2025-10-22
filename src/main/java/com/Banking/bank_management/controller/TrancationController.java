package com.Banking.bank_management.controller;

import com.Banking.bank_management.dto.Candidate;
import com.Banking.bank_management.dto.Dto;
import com.Banking.bank_management.dto.T_History;
import com.Banking.bank_management.reposiotary.CandidateRepo;
import com.Banking.bank_management.service.HistService;
import com.Banking.bank_management.service.Tran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TrancationController {

    @Autowired
    private Tran tran;

    @Autowired
    private CandidateRepo candidateRepo;

    @Autowired
    private HistService histService;

    @GetMapping("/check/{a}")
    public Candidate check(@PathVariable Long a){

        return candidateRepo.findByAc(a);
    }

//    @GetMapping
//    public List<Candidate> getall(){
//        return candidateRepo.findAll();
//    }


    @PostMapping("/submit")
    public String cr(@ModelAttribute Dto dto, Model model){

        String ref = tran.credit(dto.getAc(),dto.getAmount());
        model.addAttribute("ref",ref);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        histService.save(new T_History(ref,date,dto.getAc(),dto.getAmount()));
        return "thank";
    }

    @PostMapping("/submit1")
    public String dr(@ModelAttribute Dto dto,Model model)
    {
        String ref = tran.debit(dto.getAc(),dto.getAmount());
        model.addAttribute("ref",ref);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        histService.save(new T_History(ref,date,dto.getAc(),dto.getAmount()));
        return "thank";
    }

    @GetMapping("/credit")
    public String credit(Model model){

        return "Credit";
    }
    @GetMapping("/debit")
    public String debit(Model model){

        return "Debit";
    }



}
