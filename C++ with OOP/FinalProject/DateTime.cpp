#include "DateTime.h"
#include <iostream>
#include <string>
using namespace std;



DateTime::DateTime()
{
	month = 0;
	day = 0;
	year = 0;
}

DateTime::DateTime(int m, int d, int y)
{
	month = m;
	day = d;
	year = y;
}

int DateTime::get_month()
{
	return month;
}

int DateTime::get_day()
{
	return day;
}

int DateTime::get_year()
{
	return year;
}

void DateTime::set_month(int m)
{
	month = m;
}

void DateTime::set_day(int d)
{
	day = d;
}

void DateTime::set_year(int y)
{
	year = y;
}


