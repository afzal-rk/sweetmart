package com.mart.sweetmart.controller;

import com.mart.sweetmart.model.OrderBill;
import com.mart.sweetmart.service.OrderBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderBill")
public class OrderBillController {

    @Autowired
    private OrderBillService orderBillService;

    @PostMapping("/add")
    public OrderBill addOrderBill(@RequestBody OrderBill orderBill) {
        return orderBillService.addOrderBill(orderBill);
    }

    @PutMapping("/update")
    public OrderBill updateOrderBill(@RequestBody OrderBill orderBill) {
        return orderBillService.updateOrderBill(orderBill);
    }

    @DeleteMapping("/delete/{orderBillId}")
    public OrderBill cancelOrderBill(@PathVariable int orderBillId) {
        return orderBillService.cancelOrderBill(orderBillId);
    }

    @GetMapping("/all")
    public List<OrderBill> showAllOrderBills() {
        return orderBillService.showAllOrderBills();
    }

    @GetMapping("/{orderBillId}")
    public List<OrderBill> showAllOrderBillsById(@PathVariable int orderBillId) {
        return orderBillService.showOrderBillsById(orderBillId);
    }

}
