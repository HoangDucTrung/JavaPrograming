package com.trunghd;

public class Vehicle {
	private String name;
	private String size;
	
	private int currentVelocity;
	private int currenDirection;
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		
		this.currentVelocity = 0;
		this.currenDirection = 0;
		
	}
	
	public void streer(int direction) {
		this.currenDirection += direction;
		System.out.println("Vehicle.steer() : Steering at "+ currenDirection + " degrees.");
	}
	
	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currenDirection = direction;
		System.out.println("Vehicle.move(): Moving at "+ currentVelocity + " in direction " + currenDirection);
	}
	
}
