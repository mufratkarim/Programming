#include "Course.h"
#include <iostream>
#include <string>
using namespace std;

Course::Course(string a)
{
	course_id = a;
}
Course::Course() {

}

void Course::setCourse_id(string a)
{
	course_id = a;
}

string Course::getCourse_id()
{
	return course_id;
}
