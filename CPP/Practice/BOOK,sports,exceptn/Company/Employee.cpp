#include "Employee.h"
#include<iostream>
#include <string>
using namespace std;

Employee::Employee():companyName(""),employeeName(""),noOfLeave(0)
{
}

Employee::Employee(string companyName,string employeeName,int noOfLeave):companyName(companyName),employeeName(employeeName),noOfLeave(noOfLeave)
{

}

//getters
string Employee::getCompany()
{
	return this->companyName;
}
string Employee::getName()
{
	return this->employeeName;
}

long int Employee::getSalary()
{
	return this->salary;
}
int Employee::getLeave()
{
	return this->noOfLeave;
}

//accept
void Employee::accept()
{
	cout<<"\n Enter Employee Details";
	cout<<"\n Enter company Name :";
	getline(cin,companyName);
	cout<<"\n Enter Employee Name :";
	getline(cin,employeeName);
	cout<<"\n Enter No of Leaves :";
	cin>>noOfLeave;
}

void Employee::display()
{
	cout<<"\n Employee Details";
	cout<<"\n company Name :"<<this->companyName<<endl;
	
	cout<<"\n Employee Name :"<<this->employeeName<<endl;
	
	cout<<"\n No of Leaves :"<<this->noOfLeave<<endl;
}



	

