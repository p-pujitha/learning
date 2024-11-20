package com.pujitha.spring.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired(required = false)
    @Qualifier("address2")
    private Address address;

//   @Autowired
    Employee(Address address){
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

//    @Autowired(required = false)

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +

                " address=" + address +
                '}';
    }
}
