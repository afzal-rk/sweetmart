package com.mart.sweetmart.controller;

import com.mart.sweetmart.model.SweetOrder;
import com.mart.sweetmart.service.SweetOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sweetOrder")
public class SweetOrderController {

    @Autowired
    private SweetOrderService sweetOrderService;

    @PostMapping
    public SweetOrder addSweetOrder(@RequestBody SweetOrder sweetOrder) {
        return sweetOrderService.addSweetOrder(sweetOrder);
    }
    @PutMapping
    public SweetOrder updateSweetOrder(@RequestBody SweetOrder sweetOrder) {
        return sweetOrderService.updateSweetOrder(sweetOrder);
    }
    @DeleteMapping("/{sweetOrderId}")
    public SweetOrder cancelSweetOrder(@PathVariable int sweetOrderId) {
        return sweetOrderService.cancelSweetOrder(sweetOrderId);
    }
    @GetMapping
    public List<SweetOrder> showAllSweetOrders() {
        return sweetOrderService.showAllSweetOrders();
    }
//    @GetMapping("/{sweetOrderId}/totalcost")
//    public double calculateTotalCost(@PathVariable int sweetOrderId) {
//        return sweetOrderService.calculateTotalCost(sweetOrderId);
//    }
}
