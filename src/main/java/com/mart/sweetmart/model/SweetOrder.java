package com.mart.sweetmart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SweetOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sweetOrderId;

    @CreationTimestamp
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
