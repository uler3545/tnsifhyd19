package com.oop1.constructor;

public class ParametrizedConstructorEx{
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
 
	//Parameterized constructor
	public ParametrizedConstructorEx(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
 
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}
	}

}
