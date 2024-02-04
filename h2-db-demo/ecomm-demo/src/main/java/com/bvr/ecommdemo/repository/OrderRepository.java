package com.bvr.ecommdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bvr.ecommdemo.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
