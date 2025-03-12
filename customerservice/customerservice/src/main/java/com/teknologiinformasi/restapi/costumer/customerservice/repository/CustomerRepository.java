package com.teknologiinformasi.restapi.costumer.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teknologiinformasi.restapi.costumer.customerservice.model.Customer;




@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
