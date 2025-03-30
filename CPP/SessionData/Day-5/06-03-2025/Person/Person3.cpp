#include<iostream>
#include<string>
using namespace std;

class Person 
{
	//DM
	private:
	string addhar;//unique Identifier
	string name;
	int age;
	string phoneNumber;

	//MF
	public:
	//constructor to intialize object
	//No-arg ctor or default ctor
	Person()
	{
	cout<<"\n ctor called"<<endl;
	this->addhar = "";
	this->name = "";
	this->age = 0;
	this->phoneNumber = "";
	}

	Person(string addhar, string name, int age, string phoneNumber)
	{
	cout<<"\n Param ctor called"<<endl;
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
	}
	
	void Display() const
	{
	//Printing data
	//cout<<"\n"<<this->addhar;
	cout<<"\n"<<(*this).addhar;
	cout<<"\t"<<this->name;
	cout<<"\t"<<this->age;
	cout<<"\t"<<this->phoneNumber<<endl;
	}
};

int main()
{
	Person p1;
	Person p2("1111111", "Kriti", 30, "1238612391");
	cout<<"\n P1 address="<<&p1;
	//Accepting  data
//	p1.Accept();
//	p2.Accept();

	//Printing data
	p1.Display();
	p2.Display();

	return 0;
}
