#include"Employee.h"
#include<string>
#include<iostream>
using namespace std;

class TREmployee : public Employee
{
	private:
	int noOfLecSession;
	int noOfLabSession;
	
	public:
	TREmployee():noOfLecSession(0),noOfLabSession(0)
	{}

	TREmployee(string companyName,string employeeName,int noOfLeave,int noOfLecSession,int noOfLabSession) :Employee::Employee(companyName,employeeName,noOfLeave),noOfLecSession(noOfLecSession),noOfLabSession(noOfLabSession)
	{}

	int getLecSession()
	{
		return noOfLabSession;
	}
	
	int getLabSession()
	{
		return noOfLabSession;
	}
	
	void accept()
	{
		Employee::accept();
		cout<<"\n Enter No of Lecture Sessions :";
		cin>>noOfLecSession;
		cout<<"\n Enter No of Lab Sessions :";
		cin>>noOfLabSession;
	}


	void display()
	{
		Employee::display();
		cout<<"\n No of Lecture Sessions :"<<noOfLecSession<<endl;
		cout<<"\n No of Lab Sessions :"<<noOfLabSession<<endl;
		cout<<"\n Salary of Trainee Employee is for month :"<<this->calSalary();
	}

	long int calSalary()
	{
		long int sal;
		if(Employee::getLeave()>2)
		{
			sal=(33*1250)-(Employee::getLeave()*1250)+(this->noOfLecSession*900)+(this-> noOfLabSession *400);
		}
		else
		{
			sal=(31*1250)+(this->noOfLecSession*900)+(this-> noOfLabSession *400);
		}
		return sal;
	}
	
};
