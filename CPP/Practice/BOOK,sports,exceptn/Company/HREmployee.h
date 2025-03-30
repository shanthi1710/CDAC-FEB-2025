#include "Employee.h"
#include <string>
using namespace std;

class HREmployee : public Employee
{
	private:
		int noOfEmpHired;

	public:
		HREmployee();
		HREmployee(string,string,int,int);
	
		int getEmpHired();
		long int calSalary();
		void accept();
		void display();		
};
