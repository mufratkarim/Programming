#pragma once
#include <iostream>
#include <string>
using namespace std;

class Instructor
{
private:
	string name = "";
public:
	Instructor(string a);
	Instructor();
	void setName(string n);
	string getName();
};

