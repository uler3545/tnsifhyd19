package com.staticinstance;

public class StaticInstanceVariables {
	
		static int countOfOrders; //static variables
		static int countOfitems;
		String orderId; // Instance variables

	
	public static void main(String[] args) {
		
		StaticInstanceVariables orderInst = new StaticInstanceVariables();
		
		//Assigning to static variable and Accessing by classname.staticvaraiblename
		StaticInstanceVariables.countOfOrders = 18;
		System.out.println(StaticInstanceVariables.countOfOrders);
		
		
		//Assigning to static variables and Accessing by static variable  
		countOfitems = 90;
		System.out.println(countOfitems);
		
		
		
		//Assigning to instance variable
		orderInst.orderId="Ord1_11Nov2017_3578923";
		
		System.out.println(orderInst.orderId);
		
		
		String name="jun";//simple local variable. it is not instance and not static.
		System.out.println(name);
		
	}

}
