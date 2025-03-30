#ifndef __USER_H_
#define __USER_H_
#include<iostream>
#include<string>

using namespace std;

class User 
{
	private:
	string name;
	
	public:
	User()
	{}
	User(string name):name(name)
	{}
	
	void addUser()
	{
		cout<<"\nEnter User name:";
		cin>>name;
	}
	
	void display()
	{
		cout<<"\nUser Name:"<<this->name<<endl;
	}	
};
#endif
