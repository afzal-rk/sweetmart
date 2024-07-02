package com.mart.sweetmart.repository;

import com.mart.sweetmart.model.SweetOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SweetOrderRepository extends JpaRepository<SweetOrder, Integer> {
}
