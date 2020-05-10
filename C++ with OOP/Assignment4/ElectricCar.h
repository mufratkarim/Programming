//3. ElectricCar
//Member variable
//- batteryCapacity(you could use int or double)
//Member methods
//- parameterized constructor //No default constructor
//- getter and setter
/// The following two methods are function overriding (overriding base class methods)
//- accelerate(). //The accelerate method should add 6 to the speed field each time it is called
//- brake() // The brake method should subtract 6 from the sped field each time it is called.
//

#pragma once
#include "Engine.h"
#include "Car.h"
#include <iostream>
#include <string>
using namespace std;

class ElectricCar:public Car
{
private:
	double batteryCapacity;
public:
	ElectricCar(double l_batteryCapacity, string l_make, int l_speed, Engine eng);
	double getBatteryCapacity();
	void setBatteryCapacity(double l_batteryCapacity);
	void ElectricCarAccelerate();
	void ElectricCarBrake();
	~ElectricCar();
};

