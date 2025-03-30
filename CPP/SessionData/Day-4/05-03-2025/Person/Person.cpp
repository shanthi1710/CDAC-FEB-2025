#include<iostream>
using namespace std;

struct Person 
{
	char addhar[12];//unique Identifier
	char name[50];
	int age;
	char phoneNumber[14];
};

int main()
{
	Person p1;
	//Accepting  data
	cout<<"\n Please enter Person details"<<endl;
	cin>>p1.addhar;
	cin>>p1.name;
	cin>>p1.age;
	cin>>p1.phoneNumber;


	//Printing data
	cout<<"\n"<<p1.addhar;
	cout<<"\t"<<p1.name;
	cout<<"\t"<<p1.age;
	cout<<"\t"<<p1.phoneNumber<<endl;

	return 0;
}
