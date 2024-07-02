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

    public void addSweetOrder(SweetOrder sweetOrder){
        sweetOrderRepository.save(sweetOrder);
    }
    public void updateSweetOrder(SweetOrder sweetOrder){
        sweetOrderRepository.save(sweetOrder);
    }
    public void cancelSweetOrder(Integer sweetOrderId){
        sweetOrderRepository.deleteById(sweetOrderId);
    }
    public List<SweetOrder> showAllSweetOrders(){
        return sweetOrderRepository.findAll();
    }
}
