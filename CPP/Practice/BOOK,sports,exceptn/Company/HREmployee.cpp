#include"HREmployee.h"
#include"Employee.h"
#include<string>
#include<iostream>
using namespace std;

HREmployee::HREmployee():noOfEmpHired(0)
{}

HREmployee::HREmployee(string companyName,string employeeName,int noOfLeave,int noOfEmpHired) :Employee::Employee(companyName,employeeName,noOfLeave),noOfEmpHired(noOfEmpHired)
{}

int HREmployee::getEmpHired()
{
	return noOfEmpHired;
}

void HREmployee::accept()
{
	Employee::accept();
	cout<<"\n Enter No of Employees Hired :";
	cin>>noOfEmpHired;
}


void HREmployee::display()
{
	Employee::display();
	cout<<"\n No of Employees Hired :"<<noOfEmpHired<<endl;
	
	cout<<"\n Salary of HR Employee for month is :"<<this->calSalary();
}

long int HREmployee::calSalary()
{
	long int sal;
	if(Employee::getLeave()>3)
	{
		sal=(34*1250)-(Employee::getLeave()*1250)+(this->noOfEmpHired*500);
	}
	else
	{
		sal=(31*1250)+(this->noOfEmpHired*500);
	}
	return sal;
}
	

