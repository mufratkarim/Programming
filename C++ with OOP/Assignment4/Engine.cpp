//1. Engine
//Member variable
//- engineType //Sample value could be "petro", "diesel", "electric", and "hybrid." 
//Member methods
//- parameterized constructor // No default constructor
//- getEngineType() //Accessor (getter). (No mutator (setter) should be defined.

#include <iostream>
#include "Engine.h"
#include <string>

using namespace std;

string Engine::getEngineType() {
	return engineType;
}

Engine::~Engine()
{
}
