package com.mart.sweetmart.repository;

import com.mart.sweetmart.model.SweetOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SweetOrderRepository extends JpaRepository<SweetOrder, Integer> {

//    List<SweetOrder> findAll();
//    SweetOrder save(SweetOrder sweetOrder);
//    void delete(SweetOrder sweetOrder);
//    List<SweetOrder> findBySweetOrderId(int sweetOrderId);
}
