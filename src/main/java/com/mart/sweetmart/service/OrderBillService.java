package com.mart.sweetmart.service;

import com.mart.sweetmart.model.OrderBill;
import com.mart.sweetmart.repository.OrderBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBillService {

    @Autowired
    OrderBillRepository orderBillRepository;

    public List<OrderBill> showAllOrderBills() {
        return orderBillRepository.findAll();
    }

    public OrderBill addOrderBill(OrderBill orderBill) {
        return orderBillRepository.save(orderBill);
    }
    public OrderBill updateOrderBill(OrderBill orderBill) {
        return orderBillRepository.save(orderBill);
    }
    public OrderBill cancelOrderBill(int orderBillId) {
        OrderBill orderBill = orderBillRepository.findById(orderBillId).orElse(null);
        if (orderBill != null) {
            orderBillRepository.delete(orderBill);
        }
        return orderBill;
    }

    public List<OrderBill> showAllOrderBills(int orderBillId) {
        return orderBillRepository.findByOrderBillId(orderBillId);
    }
}
