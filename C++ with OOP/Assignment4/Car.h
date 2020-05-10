#pragma once
#include "Engine.h"
#include <iostream>
#include <string>
using namespace std;

class Car: public Engine
{
protected:
	string make;
	int speed;
	Engine engine;
public:
	Car(string l_make, int l_speed, Engine l_engine);
	string getCarMake();
	int getCarSpeed();
	Engine getCarEngine();
	void accelerate();
	void brake();
	~Car();
};

