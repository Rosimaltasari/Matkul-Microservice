package com.teknologiinformasi.restapi.costumer.customerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teknologiinformasi.restapi.costumer.customerservice.model.Customer;
import com.teknologiinformasi.restapi.costumer.customerservice.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {


   @Autowired
   private CustomerRepository customerRepository;


   public List<Customer> getAllCustomer() {
       return customerRepository.findAll();
   }


   public Optional<Customer> getCustomerById(Long id) {
       return customerRepository.findById(id);
   }


   public Customer createCustomer(Customer customer) {
       return customerRepository.save(customer);
   }


   public Customer updateCustomer(Long id, Customer customerDetails) {
       Customer customer = customerRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Customer tidak ditemukan dengan id " + id));
       customer.setNama(customerDetails.getName());
       customer.setEmail(customerDetails.getEmail());
       customer.setAddress(customerDetails.getAddress());
       return customerRepository.save(customer);
   }


   public void deleteCustomer(Long id) {
       Customer customer = customerRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Customer tidak ditemukan dengan id " + id));
       customerRepository.delete(customer);
   }
}
