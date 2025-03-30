#include<iostream>
using namespace std;

struct Person 
{
	char addhar[12];//unique Identifier
	char name[50];
	int age;
	char phoneNumber[14];
};

void Accept(Person* pp)
{
	//Accepting  data
	cout<<"\n Please enter Person details"<<endl;
	cin>>pp->addhar;
	cin>>pp->name;
	cin>>pp->age;
	cin>>pp->phoneNumber;
}

void Display(Person* pp)
{
	//Printing data
	cout<<"\n"<<pp->addhar;
	cout<<"\t"<<pp->name;
	cout<<"\t"<<pp->age;
	cout<<"\t"<<pp->phoneNumber<<endl;
}

int main()
{
	Person p1,p2;
	//Person parr[5];
	cout<<"\n size="<<sizeof(p1);
	//Accepting  data
	Accept(&p1);
	Accept(&p2);
	//call below function in loop
	//Accept(&parr[i])

	//Printing data
	Display(&p1);
	Display(&p2);
	//call below function in loop
	//Display(&parr[i])

	return 0;
}
