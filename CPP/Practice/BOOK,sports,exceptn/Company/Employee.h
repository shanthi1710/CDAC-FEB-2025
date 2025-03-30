#ifndef __Employee__H_
#define __Employee__H_

#include <string>
using namespace std;

class Employee
{
	private:
		string companyName;
		string employeeName;
		long int salary;
		int noOfLeave;
	
	public:
		Employee();

		Employee(string,string,int);

		string getCompany();
		string getName();
		long int getSalary();
		int getLeave();
		
		virtual void accept();
		virtual void display();
		virtual long int calSalary()=0;
};
#endif
