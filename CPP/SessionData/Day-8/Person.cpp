#include<iostream>
#include<string>
#include "Address.cpp"
using namespace std;

class Person 
{
	//DM
	private:
	string addhar;//unique Identifier
	string name;
	int age;
	string phoneNumber;
	//Association
	Address address;

	//MF
	public:
	//constructor to intialize object
	//No-arg ctor or default ctor
	Person():address()
	{
	cout<<"\n Person::Person()"<<endl;
	this->addhar = "";
	this->name = "";
	this->age = 0;
	this->phoneNumber = "";
	}

	Person(string addhar, string name, int age, string phoneNumber):address("","","")
	{
	cout<<"\n Person::Person(string, string, int, string)"<<endl;
	this->addhar = addhar;
	this->name = name;
	this->age = age;
	this->phoneNumber = phoneNumber;
	}

	void Accept()
	{
	//Accepting  data
	cout<<"\n Please enter Person details"<<endl;
	cin>>addhar; //cin>>this->addhar;
	cin>>this->name;
	cin>>this->age;
	cin>>this->phoneNumber;

	//call function of Address
	address.Accept();
	}
	
	void Display() const
	{
	//Printing data
	cout<<"\nPerson data"<<endl;
	cout<<"\n"<<(*this).addhar;
	cout<<"\t"<<this->name;
	cout<<"\t"<<this->age;
	cout<<"\t"<<this->phoneNumber<<endl;
	//Call function of address
	address.Display();
	}
};

