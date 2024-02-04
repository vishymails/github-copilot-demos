package com.bvr.ecommdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    public long customerId;
    public String firstName;
    public String lastName;
    public String email;
    public String password;

    public Customer() {

    }

    public Customer(long customerId, String firstName, String lastName, String email, String password) {
    	this.customerId = customerId;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.password = password;
    }

    public long getCustomerId() {
    	return customerId;
    }

    public void setCustomerId(long customerId) {
    	this.customerId = customerId;
    }

    public String getFirstName() {
    	return firstName;
    }

    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    public String getLastName() {
    	return lastName;
    }

    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }

    public String getEmail() {
    	return email;
    }

    public void setEmail(String email) {
    	this.email = email;
    }

    public String getPassword() {
    	return password;
    }

    public void setPassword(String password) {
    	this.password = password;
    }

    @Override
    public String toString() {
    	return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + "]";
    }

}
