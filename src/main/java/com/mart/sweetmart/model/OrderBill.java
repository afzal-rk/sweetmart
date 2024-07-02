package com.mart.sweetmart.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name = "OrderBill")
public class OrderBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderBillId;

    private LocalDate createdDate;

    private float totalCost;
//    @OneToMany
//    private List<SweetOrder> listSweetOrder ;


}
