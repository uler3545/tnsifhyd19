package com.oop4.polymorphism;

public class PolymorphismMOverload {
	
	// method without parameter
	  public void display() {
	    for (int i = 0; i < 8; i++) {
	      System.out.print("*");
	    }
	  }

	  // method with single parameter
	  public void display(char sign) {
	    for (int i = 0; i < 5; i++) {
	      System.out.print(sign);
	    }
	  }

}
