package com.test2;

public class Car extends Vehicle {

	String modelType;

	public void showDetail() {
		vehicleType = "Car"; // accessing Vehicle class member variable
		modelType = "Sports";
		System.out.println(modelType + " " + vehicleType);
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.showDetail();
	}

}
