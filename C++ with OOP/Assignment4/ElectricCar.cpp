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

#include "ElectricCar.h"
#include <iostream>
#include "Car.h"
#include "Engine.h"

using namespace std;

ElectricCar::ElectricCar(double l_batteryCapacity, string l_make, int l_speed, Engine eng) 
	:batteryCapacity(l_batteryCapacity), Car(l_make, l_speed, eng) {}

//Getters
double ElectricCar::getBatteryCapacity() {
	return batteryCapacity;
}
//Setters
void ElectricCar::setBatteryCapacity(double l_batteryCapacity) {
	batteryCapacity = l_batteryCapacity;
}

//Electric Car Accelerate
void ElectricCar::ElectricCarAccelerate() {
	speed += 6;
}

//Electric Car brake
void ElectricCar::ElectricCarBrake() {
	speed -= 6;
}


ElectricCar::~ElectricCar()
{
}
