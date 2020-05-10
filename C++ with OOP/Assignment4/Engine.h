#pragma once
#include <iostream>
using namespace std;

class Engine
{
private:
	string engineType;
public:
	Engine(string l_engineType)
		:engineType(l_engineType) {}
	string getEngineType();
	~Engine();
};

