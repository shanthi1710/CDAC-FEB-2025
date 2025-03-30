#include <iostream>
using namespace std;

// Date class for storing the joining date of an employee
class Date
{
public:
    int day, month, year;

    Date(int d = 1, int m = 1, int y = 2000) : day(d), month(m), year(y) {}

    void display() const
    {
        cout << day << "/" << month << "/" << year;
    }
};

// Abstract Base Class Employee
class Employee
{
protected:
    int id;
    string name;
    Date dateofjoining;
    double salary;

public:
    Employee(int id, string name, Date doj, double salary)
        : id(id), name(name), dateofjoining(doj), salary(salary) {}

    virtual void Calculate() = 0; // Pure virtual function

    virtual void display() const
    {
        cout << "ID: " << id << "\nName: " << name << "\nDate of Joining: ";
        dateofjoining.display();
        cout << "\nSalary: " << salary << endl;
    }

    virtual ~Employee() {}
};

// Manager Class inherits from Employee
class Manager : public Employee
{
protected:
    double ta;  // Travelling Allowance
    double hra; // House Rent Allowance

public:
    Manager(int id, string name, Date doj, double salary, double ta, double hra)
        : Employee(id, name, doj, salary), ta(ta), hra(hra) {}

    void Calculate() override
    {
        salary += (ta + hra); // Adding allowances to salary
    }

    void display() const override
    {
        Employee::display();
        cout << "Travelling Allowance: " << ta << "\nHouse Rent Allowance: " << hra << endl;
    }
};

// SalesPerson Class inherits from Employee
class SalesPerson : public Employee
{
protected:
    double sales;      // Sales amount
    double commission; // Commission percentage

public:
    SalesPerson(int id, string name, Date doj, double salary, double sales, double commission)
        : Employee(id, name, doj, salary), sales(sales), commission(commission) {}

    void Calculate() override
    {
        salary += (sales * commission / 100); // Adding commission to salary
    }

    void display() const override
    {
        Employee::display();
        cout << "Sales: " << sales << "\nCommission: " << commission << "%" << endl;
    }
};

// WageEmp Class inherits from SalesPerson
class WageEmp : public SalesPerson
{
protected:
    double rate; // Rate per unit

public:
    WageEmp(int id, string name, Date doj, double salary, double sales, double commission, double rate)
        : SalesPerson(id, name, doj, salary, sales, commission), rate(rate) {}

    void Calculate() override
    {
        salary += rate; // Adding rate-based earnings to salary
    }

    void display() const override
    {
        SalesPerson::display();
        cout << "Rate: " << rate << endl;
    }
};

// Main Function to test the classes
int main()
{
    Manager m(101, "Alice", Date(10, 5, 2015), 50000, 5000, 7000);
    SalesPerson sp(102, "Bob", Date(12, 6, 2018), 40000, 100000, 5);
    WageEmp we(103, "Charlie", Date(15, 7, 2020), 35000, 50000, 3, 2000);

    cout << "\nBefore Salary Calculation:\n";
    m.display();
    cout << "\n";
    sp.display();
    cout << "\n";
    we.display();

    // Calculate salaries
    m.Calculate();
    sp.Calculate();
    we.Calculate();

    cout << "\nAfter Salary Calculation:\n";
    m.display();
    cout << "\n";
    sp.display();
    cout << "\n";
    we.display();

    return 0;
}

/*
Create class Employee with following attributes -
Emp - id, name, dateofpinning (object of date clock) , salary
Manager - inherit Manager from Employee having extra attribute - ta(travelling
allowance), Hra (house rent allowance)
SalesPerson - inherit SalesPerson from Employee having extra attribute - sales, comn
WageEmp - inherit WageEmp from SalesPearson having extra attribute - rate
Implement Calculate for all classes
Emp → pure virtual
*/