package com.afrin.DependencyInjection;

public class Student {
	private Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

	public void showStudentInfo() {
		address.showAddress();
	}
}
