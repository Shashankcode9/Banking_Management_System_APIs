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
public class T_History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String ref;
    String date;
    Long ac;
    Double amount;

    public T_History(String ref, String date, Long ac, Double amount) {
        this.ref = ref;
        this.date = date;
        this.ac = ac;
        this.amount = amount;
    }
}
