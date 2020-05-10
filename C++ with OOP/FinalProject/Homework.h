#pragma once
#include "Course.h"
#include "Instructor.h"
#include "DateTime.h"
#include <iostream>
#include <string>
using namespace std;

class Homework
{
private:
	string status="";
public:
	Homework();
	Homework(string status);
	void setStatus(string a);
	string getStatus();
	Course subject;
	Instructor name;
	DateTime due_date;
	// Operator Overloading with bool operator to prevent any kind of failure in creating homework
	operator bool() const;
};

