
#include <bits/stdc++.h>

using namespace std;
class Employee
{
public:
    int empid;
    string name;
    string address;
    double salary;

    Employee(int empid, string name, string address, double salary) : empid(empid), name(name), address(address), salary(salary)
    {
    }
    void display()
    {
        cout << "Employee ID:->" << empid << "Employee Name:->" << name << "Employee Address:->" << address << "Employee salary:->" << salary << endl;
    }
};

class EmployeeManager
{
private:
    vector<Employee> employees;

public:
    void add_records(int id, string name, string address, double salary)
    {
        employees.push_back(Employee(id, name, address, salary));
    }
    void display_all_records()
    {
        if (employees.empty())
        {
            cout << "No Employee found!" << endl;
            return;
        }
        for (int i = 0; i < employees.size(); i++)
        {
            employees[i].display();
        }
    }
    void search_enployee(int id)
    {
        for (int i = 0; i < employees.size(); i++)
        {
            if (employees[i].empid == id)
            {
                employees[i].display();
                return;
            }
        }
        cout << "Employee not found" << endl;
    }
    void delete_record(int id)
    {
        for (int i = 0; i < employees.size(); i++)
        {
            if (employees[i].empid == id)
            {
                employees.erase(employees.begin() + i);
                cout << "employee deleted successfuly!" << endl;
                return;
            }
        }
        cout << "employee not found" << endl;
    }
    void modify_record(int id, string name, string address, double salary)
    {
        for (int i = 0; i < employees.size(); i++)
        {
            if (employees[i].empid == id)
            {
                employees[i].name = name;
                employees[i].address = address;
                employees[i].salary = salary;
                cout << "Employee details updated successfully.\n";
                return;
            }
        }
        cout << "Employee not found.\n";
    }
};
int main()
{
    EmployeeManager manager;
    int choice;
    int id;
    string name, address;
    double salary;

    do
    {
        cout << "\n1.Add employee:->" << "\n2.Display all employee:->" << "\n3.Search Employee:->" << "\n4.Delete Employee:->" << "\n5.Modify Employee:->" << "\n6.Exit..." << endl;
        cin >> choice;
        switch (choice)
        {
        case 1:
        {
            cout << "Enter Employee ID : ";
            cin >> id;
            cin.ignore();
            cout << "Enter employee Name:->";
            getline(cin, name);
            cout << "Enter employee addresss:->";
            getline(cin, address);
            cout << "Enter employee salary:->";
            cin >> salary;
            manager.add_records(id, name, address, salary);
            break;
        }
        case 2:
        {
            cout << "------All Employee-------" << endl;
            manager.display_all_records();
            break;
        }
        case 3:
        {
            int id;
            cout << "Enter Employee id:->" << endl;
            cin >> id;
            manager.search_enployee(id);
            break;
        }
        case 4:
        {
            int id;
            cout << "Enter employee you want to delete :->" << endl;
            cin >> id;
            manager.delete_record(id);
            break;
            break;
        }
        case 5:
        {
            cout << "Enter Employee ID : ";
            cin >> id;
            cin.ignore();
            cout << "Enter employee Name:->";
            getline(cin, name);
            cout << "Enter employee addresss:->";
            getline(cin, address);
            cout << "Enter employee salary:->";
            cin >> salary;
            manager.modify_record(id, name, address, salary);
            break;
        }
        case 6:
        {
            cout << "Exit..." << endl;
            break;
        }
        default:
        {

            cout << "Invalid Choice..!" << endl;
        }
        }
    } while (choice != 6);
}

/*
Create Emp class with following attributes -
eid, name, address, salary
Create vector and implement following -
1. Add Record
2. Display all
3. Search
4. Delete
5. Modify
Use Menu Driven Program
*/
