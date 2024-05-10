package com.coreconcepts.superr;

public class AnimalSuperChildVariable extends AnimalSuperParentVariable {
	
	String color="blue";
	
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
	
	public static void main(String[] args) {
		
		AnimalSuperChildVariable a1 = new AnimalSuperChildVariable();
		a1.printColor();
		
	}
}
