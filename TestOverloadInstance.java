package com.staticinstance;

//filename Test.java
public class TestOverloadInstance {
	public  void func() {
		System.out.println("Test.foo() called ");
	}
	public  void func(int a) {
		System.out.println("Test.foo(int) called ");
	}
	public static void main(String args[])
	{
		TestOverloadInstance t1 = new TestOverloadInstance();
		t1.func();
		t1.func(87);
	}
}
