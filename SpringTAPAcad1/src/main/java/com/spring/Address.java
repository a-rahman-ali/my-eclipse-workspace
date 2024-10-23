package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String state;

	public Address() {
		System.out.println("Address() - 0");
	}

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
//		System.out.println("Address(params)");
	}

	@Override
	public String toString() {
		return "[ " + city + ", " + state + " ]";
	}

	public void setCity(String city) {
//		System.out.println("setCity()");
		this.city = city;
	}

	public void setState(String state) {
//		System.out.println("setState()");
		this.state = state;
	}

}
