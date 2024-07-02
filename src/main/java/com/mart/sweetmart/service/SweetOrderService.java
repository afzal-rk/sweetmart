package com.mart.sweetmart.service;

import com.mart.sweetmart.model.SweetOrder;
import com.mart.sweetmart.repository.SweetOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SweetOrderService {

    @Autowired
    SweetOrderRepository sweetOrderRepository;

    public SweetOrder addSweetOrder(SweetOrder sweetOrder) {
        return sweetOrderRepository.save(sweetOrder);
    }
    public SweetOrder updateSweetOrder(SweetOrder sweetOrder) {
        return sweetOrderRepository.save(sweetOrder);
    }
    public SweetOrder cancelSweetOrder(int sweetOrderId) {
        SweetOrder sweetOrder = sweetOrderRepository.findById(sweetOrderId).orElse(null);
        if (sweetOrder != null) {
            sweetOrderRepository.delete(sweetOrder);
        }
        return sweetOrder;
    }
    public List<SweetOrder> showAllSweetOrders() {
        return sweetOrderRepository.findAll();
    }

//    public double calculateTotalCost(int sweetOrderId) {
//        SweetOrder sweetOrder = sweetOrderRepository.findById(sweetOrderId).orElse(null);
//        if (sweetOrder != null) {
//            return sweetOrder.getSweetItems().stream()
//                    .mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity())
//                    .sum();
//        }
//        return 0;
//    }
}
