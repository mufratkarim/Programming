#pragma once
#include <iostream>
#include <string>
using namespace std;

class DateTime
{
private:
	int month,year,day;
public:
	DateTime();
	DateTime(int month, int day, int year);
	int get_month();
	int get_day();
	int get_year();
	void set_month(int m);
	void set_day(int d);
	void set_year(int y);
};

