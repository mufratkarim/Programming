//
//2. Car
//MemberVariables
//- make //The make field references a String object that holds the make of the car
//- speed //The speed field is an int that holds the car's current speed
//- engine //Datatype here is class Engine, which entails an aggregation relationship between Car and Engine
//Member methods
//- parameterized constructor. 
//The constructor should take arguments and assign them to car's engine and make. 
//The constructor should also assign 0 to the speed field. (No default constructor should be defined)
//- Accessors(getters) //Appropriate accessor methods should get the values stored in an object's make, speed and engine field. (Note: again, no mutators (setter) here)
//- accelerate() 
//The accelerate method should add 5 to the speed field each time it is called
//- brake() //The brake method should subtract 5 from the speed field each time it is called.

#include <iostream>
#include "Car.h"
using namespace std;


Car::Car(string l_make, int l_speed, Engine l_engine)
	:make(l_make), speed(l_speed), engine(l_engine), Engine("Petrol") {}

//Getters
string Car::getCarMake() {
	return make;
}

int Car::getCarSpeed() {
	return speed;
}

Engine Car::getCarEngine() {
	return engine;
}

//Accelerate
void Car::accelerate() {
	speed += 5;
}

//brake
void Car::brake() {
	speed -= 5;
}



Car::~Car()
{
}
