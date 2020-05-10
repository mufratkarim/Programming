//BCS 230 Assignment 5 – Inheritance, aggregation
//You will need to submit 3.h files(header files) and 3.cpp files(implementation files) and the client code, also a.cpp file.
//Program specifications
//In this assignment, you will be creating three classes : Car, ElectricCar, and Engine.
//4. In main()
//1) Create an ElectricCar object
//2) Make function calls the accelerate() twice and brake() once.
//3) Display its current speed and the engine type.

#include <iostream>
#include <string>
#include "ElectricCar.h"
int main() {
	Engine engine1("Petrol");
	ElectricCar ElectricCar1(20, "Lamborgini", 50, engine1);
	ElectricCar1.ElectricCarAccelerate();
	ElectricCar1.ElectricCarAccelerate();
	ElectricCar1.ElectricCarBrake();
	cout << "The current speed is " << ElectricCar1.getCarSpeed() << endl;
	cout << "And the current engine type is " << ElectricCar1.getEngineType() << endl;
	system("pause");
}
