package com.mart.sweetmart.repository;

import com.mart.sweetmart.model.OrderBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderBillRepository extends JpaRepository<OrderBill,Integer> {
    List<OrderBill> findByOrderBillId(int orderBillId);
}
