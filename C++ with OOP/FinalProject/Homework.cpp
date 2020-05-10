#include "Homework.h"
#include <iostream>
#include <string>
using namespace std;

Homework::Homework()
{
}

Homework::Homework(string s)
{
	status = s;
}

void Homework::setStatus(string a)
{
	status = a;
}

string Homework::getStatus()
{
	return status;
}

Homework::operator bool() const
{
	return true;
}
