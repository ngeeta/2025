package com.practice.AbstractInterface;

public class ElectricCar extends Car {
	int a=30;
	@Override
	public final String drive() {
        return "Driving an electric car "+a;
    }
	public static void main(String[] args) {
		
		 final Car car = new ElectricCar();
		// car=new Car(); can not reassign car ref to other Object
System.out.println(car.drive());

        System.out.print(car.drive());

	}

}
