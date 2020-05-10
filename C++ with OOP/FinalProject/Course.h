#pragma once
#include <iostream>
#include <string>
using namespace std;

class Course
{
private:
	string course_id = "";
public:
	Course(string a);
	Course();
	void setCourse_id(string a);
	string getCourse_id();
};

