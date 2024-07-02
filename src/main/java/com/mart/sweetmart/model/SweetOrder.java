package com.mart.sweetmart.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Entity
@Table(name = "SweetOrder")
public class SweetOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sweetOrderId;

    private LocalDate createdDate;
    private Float totalCost;

//    @OneToMany(mappedBy = "sweetOrder")
//    private List<SweetItem> sweetItems;
//
//    @ElementCollection
//    private Map<Product, Long> products;
//
//    @ManyToOne
//    @JoinColumn(name = "customerId")
//    private Customer customer;


}
