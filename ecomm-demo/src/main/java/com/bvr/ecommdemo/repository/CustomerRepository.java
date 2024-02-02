package com.bvr.ecommdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bvr.ecommdemo.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>  {

}
