package com.Banking.bank_management.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Long ac;
    String name;
    Double balance;

    public Candidate( Long ac, String name, Double balance) {
        this.ac = ac;
        this.name = name;
        this.balance = balance;
    }
}
