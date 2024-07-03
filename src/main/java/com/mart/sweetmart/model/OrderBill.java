package com.mart.sweetmart.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderBill {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderBillId;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    @CreationTimestamp
    private LocalDateTime createdDate;

    private double totalCost;
//    @OneToMany
//    @JoinColumn(name = "sweetOrderId")
//    private List<SweetOrder> sweetOrders;

}
