package com.oop1.constructor;

public class ConstructorEx {
	
	private String brand;
	
	public ConstructorEx(String brand) {
		this.brand=brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public static void main(String[] args) {
		
		ConstructorEx phone = new ConstructorEx("Oneplus");
		System.out.println (phone.getBrand ());
	}

}
