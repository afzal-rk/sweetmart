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

    public List<OrderBill> showAllOrderBills(){
        return orderBillRepository.findAll();
    }
    public void addOrderBill(OrderBill orderBill){
        orderBillRepository.save(orderBill);
    }
    public void updateOrderBill(OrderBill orderBill){
        orderBillRepository.save(orderBill);
    }
    public void cancelOrderBill(Integer orderBillId){
        orderBillRepository.deleteById(orderBillId);
    }


}
