#include<iostream>
using namespace std;

struct Person 
{
	//DM
	private:
	char addhar[12];//unique Identifier
	char name[50];
	int age;
	char phoneNumber[14];

	//MF
	public:
	/*void Accept(Person* const pp)
	{
	//Accepting  data
	cout<<"\n Please enter Person details"<<endl;
	cin>>pp->addhar;
	cin>>pp->name;
	cin>>pp->age;
	cin>>pp->phoneNumber;
	}*/

	void Accept()
	{
//		this = nullptr;
	cout<<"\n this="<<this;
	//Accepting  data
	cout<<"\n Please enter Person details"<<endl;
	cin>>addhar; //cin>>this->addhar;
	cin>>this->name;
	cin>>this->age;
	cin>>this->phoneNumber;
		this->age = 10;
	}
	
	/*void Display(const Person* const pp)
	{
	//Printing data
	cout<<"\n"<<pp->addhar;
	cout<<"\t"<<pp->name;
	cout<<"\t"<<pp->age;
	cout<<"\t"<<pp->phoneNumber<<endl;
	}*/
	void Display() const
	{
		//this=nullptr;
		//this->age = 10;
	//Printing data
	cout<<"\n"<<this->addhar;
	cout<<"\t"<<this->name;
	cout<<"\t"<<this->age;
	cout<<"\t"<<this->phoneNumber<<endl;
	}
};

int main()
{
	Person p1,p2;
	cout<<"\n P1 address="<<&p1;
	//Accepting  data
	p1.Accept();
	p2.Accept();

	//Printing data
	p1.Display();
	p2.Display();

	return 0;
}
