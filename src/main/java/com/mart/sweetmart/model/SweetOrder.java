package com.mart.sweetmart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Entity
@Table(name = "SweetOrder")
public class SweetOrder {


    @Id
    private long sweetOrderId;
//    private List<SweetItem> listItems = new ArrayList<SweetItem>();
//    private user = new User;
//    Map<Product, Long> groupedProducts = new Map<Product, Long>();

    LocalDate createdDate = LocalDate.now();


}
