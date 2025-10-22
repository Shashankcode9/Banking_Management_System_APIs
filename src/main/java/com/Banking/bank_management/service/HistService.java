package com.Banking.bank_management.service;

import com.Banking.bank_management.dto.T_History;
import com.Banking.bank_management.reposiotary.THistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistService {

    @Autowired
    private THistoryRepo tHistoryRepo;

    public T_History save(T_History tHistory){
       return tHistoryRepo.save(tHistory);
    }
}
