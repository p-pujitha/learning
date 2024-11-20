/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sprinbootspringsecurity.springsecurityauthtoken.repository;
import com.sprinbootspringsecurity.springsecurityauthtoken.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author ppujita5
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
