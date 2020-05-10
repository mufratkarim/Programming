#include "Instructor.h"
#include <iostream>
#include <string>
using namespace std;


Instructor::Instructor(string a)
{
	name = a;
}

Instructor::Instructor()
{
}

void Instructor::setName(string n)
{
	name = n;
}

string Instructor::getName()
{
	return name;
}
