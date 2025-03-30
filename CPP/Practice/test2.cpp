#include <bits/stdc++.h>

using namespace std;
class Address
{
private:
    string area;
    string city;
    string pincode;

public:
    Address() : area(""), city(""), pincode("")
    {
    }
    Address(string area, string city, string pincode) : area(area), city(city), pincode(pincode)
    {
    }
    void Accept()
    {
        cout << "Enter area:->";
        cin >> area;
        cout << "Enter city:->";
        cin >> city;
        cout << "Enter pincode:->";
        cin >> pincode;
    }
    void Dispaly()
    {
        cout << "\n area:->" << area << "\n city:->" << city << "\npincode:->" << pincode << endl;
    }
};

class Student
{
private:
    int rollno;
    string name;
    Address permAddress;
    Address currAddress;

public:
    Student() : rollno(0), name("") {}
    Student(int rollno, string name, Address permAddress, Address currAddress) : rollno(rollno), name(name), permAddress(permAddress), currAddress(currAddress)
    {
    }
    void Accept()
    {
        cout << "Enter Studetn roll.no.:->";
        cin >> rollno;
        cout << "Enter Studetn name:->";
        cin >> name;
        cout << "\n<---permanent address--->\n";
        permAddress.Accept();
        cout << "\n<---current address--->\n";
        currAddress.Accept();
    }
    void Display()
    {
        cout << "\nStudent Roll no:->" << rollno << "\nStudent name:->" << name << endl;
        cout << "\nStudent permant address:->";
        permAddress.Dispaly();
        cout << "\nStudent current address:->";
        currAddress.Dispaly();
    }
};
int main()
{
    Student s;
    s.Accept();
    s.Display();

    return 0;
}
/*
Create class Address with following -
area, city, pincode
Create class Student having -
rno, name, permanentAddress, currentAddress
Create object with Parameters like -
Student s1(101,”sweta”,”Shivaji Nagar”,”Satara”,411009,”Pashan”,”Pune”,”411003)
permanentAddress
currentAddress
*/