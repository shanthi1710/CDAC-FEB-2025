#include<iostream>
#include<string>
using namespace std;

class Address 
{
	//DM
	private:
	string line1;
	string line2;
	string pin;

	//MF
	public:
	//constructor to intialize object
	//No-arg ctor or default ctor
	Address()
	{
	cout<<"\n Address::Address()"<<endl;
	this->line1 = "";
	this->line2 = "";
	this-> pin= "";
	}

	Address(string line1, string line2, string pin)
	{
	cout<<"\n Address::Address(string, string, string)"<<endl;
	this->line1 = line1;
	this->line2 = line2;
	this->pin = pin;
	}
	
	void Accept()
	{
		cout<<"\n please enter adresss data"<<endl;
	cin>>line1;
	cin>>line2;
	cin>>pin;
	}
	void Display() const
	{
		cout<<"\n Adresss data"<<endl;
	//Printing data
	cout<<"\n"<<line1<<", "<<line2<<", "<< pin ;
	}
};
