package com.afrin.DependencyInjection;

public class Address {
	private String city;

	public void setCity(String city) {
		this.city = city;
	}

	public void showAddress() {
		System.out.println("City: " + city);
	}
}
