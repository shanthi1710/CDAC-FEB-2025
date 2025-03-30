#include <iostream>

using namespace std;

class Employee
{
protected:
    string name;
    double baseSalary;

public:
    Employee(string name, double baseSalary) : name(name), baseSalary(baseSalary)
    {
    }
    virtual void Calculate_salary()
    {
        cout << "Base salary of employee: " << baseSalary << endl;
    }

    virtual ~Employee() {}
};
class Manager : virtual public Employee
{
protected:
    double bonus;

public:
    Manager(string name, double salary, double bonus) : Employee(name, salary), bonus(bonus)
    {
    }
    void Calculate_salary() override
    {
        cout << "Manager Salary" << (baseSalary + bonus) << endl;
    }
};
class SalesPerson : virtual public Employee
{
protected:
    double commission;

public:
    SalesPerson(string name, double salary, double commission) : Employee(name, salary), commission(commission)
    {
    }
    void Calculate_salary() override
    {
        cout << "SalesPerson Salary: " << (baseSalary + commission) << endl;
    }
};
class SalesManager : public Manager, public SalesPerson
{
public:
    SalesManager(string n, double salary, double b, double c)
        : Employee(n, salary), Manager(n, salary, b), SalesPerson(n, salary, c) {}

    void Calculate_salary() override
    {
        cout << "SalesManager Salary: " << (baseSalary + bonus + commission) << endl;
    }
};
int main()
{
    SalesManager sm("John Doe", 50000, 10000, 5000);
    sm.Calculate_salary();
    return 0;
}

/*
Inherit Sales Manager class from Manager and SalesPerson - use calculate_salary  -Virtual base class
*/