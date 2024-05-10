package com.coreconcepts.abstractclass;

public class MainAbstract {
	
	public static void main(String[] args) {
		AbstPerson ravi = new VegAbst();
		ravi.speak();
		ravi.eat();
		System.out.println("=======================");
		AbstPerson priya = new NonvegAbst();
		priya.speak();
		priya.eat();
	}

}
