package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("goldCustomer")
public class GoldCustomer implements ICustomer {

	int id;
	String name;

	@Autowired
	Address address;

	public GoldCustomer() {
		System.out.println("GoldCustomer() - 0");
	}

	public GoldCustomer(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("GoldCustomer(params)");
	}

	@Override
	public String getCustomerDetails() {
		return "Gold Customer";
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + address;
	}

	public void setId(int id) {
		System.out.println("setId()");
		this.id = id;
	}

	public void setName(String name) {
		System.out.println("setName()");
		this.name = name;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress()");
		this.address = address;
	}

	public void start() {
		System.out.println("start-init called");
	}

	public void stop() {
		System.out.println("stop-destroy called");
	}

}
