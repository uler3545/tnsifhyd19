package com.oop3.encapsulation;

public class EncapsulationMain {
	
	public static void main(String[] args) {
		
		EncapsulationEx e3 = new EncapsulationEx();
		e3.setAge(22);
		e3.setGender("female");
		e3.setName("jenny");
		
		System.out.println(e3.getAge());
		System.out.println(e3.getGender());
		System.out.println(e3.getName());
		
	}
}
