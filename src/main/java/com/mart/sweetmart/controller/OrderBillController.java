package com.mart.sweetmart.controller;

import com.mart.sweetmart.model.OrderBill;
import com.mart.sweetmart.service.OrderBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderBill")
public class OrderBillController {

    @Autowired
    private OrderBillService orderBillService;

//    @PostMapping
//    public OrderBill createOrderBill(@RequestBody OrderBill orderBill) {
//        return orderBillService.addOrderBill(orderBill);
//    }heeloooo


}
