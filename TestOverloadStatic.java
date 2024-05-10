


package com.staticinstance;

//filename Test.java
public class TestOverloadStatic {
	public static void fab() {
		System.out.println("Test.fab() called ");
	}
	public static void fab(int a) {
		System.out.println("Test.fab(int) called ");
	}
	
	public static void fab(float b) {
		System.out.println("float value is displayed");
	}
	public static void main(String args[])
	{
		TestOverloadStatic.fab();
		TestOverloadStatic.fab(150);
		TestOverloadStatic.fab(129.2f);
	}
}
