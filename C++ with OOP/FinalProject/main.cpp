// Mufrat Karim Aritra
// Final Project BCS 230
// Grace Zhao
// Please help me out by giving me an A if you are satisfied with this final project  

#include "Course.h"
#include "Instructor.h"
#include "DateTime.h"
#include "Homework.h"
#include <iostream>
#include <string>
#include <fstream>
using namespace std;

// User Defined function that displays all the homework assignments that are displayed within 3 days
void display_homeworks(Homework* hw, int m, int d, int y) {
	
	system("cls");
	cout << "**************************Homework Management System***************************" << endl;
	cout << "\nThese are the homeworks that are due within the next 3 days: " << endl << endl;

	// Function Chaining
	for (int i = 0; i < 6; i++) {

		if (((hw + i)->due_date.get_year() == y) && ((hw + i)->due_date.get_month() == m) &&
			((hw + i)->due_date.get_day() == d || ((hw + i)->due_date.get_day() == d + 1
				|| ((hw + i)->due_date.get_day() == d + 2))))
		{
			(hw + i)->setStatus("In Progress");
			cout << "\nStatus: " << (hw + i)->getStatus();
			cout <<"\nHomework Num: " << i+1<< "\nCourse Name: " << (hw+i)->subject.getCourse_id() << endl;
			cout << "Instructor Name: " << (hw+i)->name.getName() << endl;
			cout << "Due Date: " << (hw+i)->due_date.get_month()
				<< "/" << (hw+i)->due_date.get_day() << "/" << (hw+i)->due_date.get_year() << endl << endl;
		}
	}

}


int main() {

	int month = 0, day = 0, year = 0;

	Homework h1;
	//Function Chaining
	h1.subject.setCourse_id("BCS 230");
	h1.name.setName("Grace Zhao");
	h1.due_date.set_month(5);
	h1.due_date.set_day(8);
	h1.due_date.set_year(2019);

	Homework h2;
	h2.subject.setCourse_id("ACC 110");
	h2.name.setName("Robert California");
	h2.due_date.set_month(5);
	h2.due_date.set_day(8);
	h2.due_date.set_year(2019);

	Homework h3;
	h3.subject.setCourse_id("ECO 115");
	h3.name.setName("Michael Scott");
	h3.due_date.set_month(5);
	h3.due_date.set_day(10);
	h3.due_date.set_year(2019);

	Homework h4;
	h4.subject.setCourse_id("ENG 320");
	h4.name.setName("Django Caprio");
	h4.due_date.set_month(5);
	h4.due_date.set_day(10);
	h4.due_date.set_year(2019);

	Homework h5;
	h5.subject.setCourse_id("MTH 230");
	h5.subject.setCourse_id("Carlos Inniesta");
	h5.due_date.set_month(5);
	h5.due_date.set_day(12);
	h5.due_date.set_year(2019);

	Homework h6;
	h6.subject.setCourse_id("VIS 230");
	h6.name.setName("Mark Schulte");
	h6.due_date.set_month(5);
	h6.due_date.set_day(12);
	h6.due_date.set_year(2019);

	//Array of all Homeworks
	Homework allHomeworks[20] = { h1,h2,h3,h4,h5,h6 };
	Homework* allhw = allHomeworks;

	// Display of My Program
	cout << "**************************Hey, I'm Mufrat Karim Aritra***************************" << endl << endl;
	cout << "**************************This is my Final Project*******************************" << endl << endl;
	cout << "**********************Homework Tracking Management System************************" << endl << endl;
	cout << "\nPlease enter a month (1-12): "; cin >> month;
	cout << "\nPlease enter a day (1-31): "; cin >> day;
	cout << "\nPlease enter a year (2018-2019): "; cin >> year;
	
	display_homeworks(allhw, month, day, year);
	
	//File Management 
	// This coding will save all of my homeworks into two notepad files

	// First File: Pending Homeworks
	ofstream outFile1("Pending Homeworks.txt");
	if (outFile1.is_open()) {
		outFile1 << "**************************Homework Tracking Management System***************************" << endl;
		outFile1 << "\nTonight's Date: " << month << "/" << day << "/" << year << endl;
		outFile1 << "\nThe List of Homeworks: " << endl;
		for (int i = 0; i < 6; i++) {

			if (((allhw + i)->due_date.get_year() == year) && ((allhw + i)->due_date.get_month() == month) &&
				((allhw + i)->due_date.get_day() == day || ((allhw + i)->due_date.get_day() == day + 1
					|| ((allhw + i)->due_date.get_day() == day + 2))))
			{
				(allhw + i)->setStatus("In Progress");
				outFile1 << "\nStatus: " << (allhw + i)->getStatus();
				outFile1 << "\nHomework Num: " << (i + 1) << "\nCourse Name: " << (allhw + i)->subject.getCourse_id() << endl;
				outFile1 << "Instructor Name: " << (allhw + i)->name.getName() << endl;
				outFile1 << "Due Date: " << (allhw + i)->due_date.get_month()
					<< "/" << (allhw + i)->due_date.get_day() << "/" << (allhw + i)->due_date.get_year() << endl << endl;
			}
		}
	};
	outFile1.close();

	// Second File: Completed Homeworks
	ofstream outFile2("Completed Homeworks.txt");
	if (outFile2.is_open()) {
		outFile2 << "**************************Homework Tracking Management System***************************" << endl;
		outFile2 << "\nTonight's Date: " << month << "/" << day << "/" << year << endl;
		outFile2 << "\nThe List of Homeworks: " << endl;
		
		for (int i = 0; i < 6; i++) {
			if (!(((allhw + i)->due_date.get_year() == year) && ((allhw + i)->due_date.get_month() == month) &&
				((allhw + i)->due_date.get_day() == day || ((allhw + i)->due_date.get_day() == day + 1
					|| ((allhw + i)->due_date.get_day() == day + 2))))) {
				(allhw + i)->setStatus("Completed/More than 3 days due");
				outFile2 << "\nStatus: " << (allhw + i)->getStatus();
				outFile2 << "\nHomework Num: " << (i + 1) << "\nCourse Name: " << (allhw + i)->subject.getCourse_id() << endl;
				outFile2 << "Instructor Name: " << (allhw + i)->name.getName() << endl;
				outFile2 << "Due Date: " << (allhw + i)->due_date.get_month()
					<< "/" << (allhw + i)->due_date.get_day() << "/" << (allhw + i)->due_date.get_year() << endl << endl;
			}
		}
	};
	outFile2.close();

	system("pause");


}
