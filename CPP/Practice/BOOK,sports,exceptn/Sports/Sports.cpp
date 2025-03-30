#ifndef __Sports_H_
#define __Sports_H_

#include <iostream>
#include <string>

using namespace std;

class Sports
{
	private:
	string name;
	int fees;
	
	public:
	
	Sports():name(""),fees(0)
	{}
	
	Sports(string name,int fees)
	{
		this->name=name;
		this->fees=fees;
	}
	
	void display()
	{
		cout<<"\n Sport name="<<this->name<<endl;
		cout<<"\n Sport fees="<<this->fees<<endl;
	}
	
	void accept()
	{
		cout<<"\nEnter Sport name:";
		cin>>name;
		cout<<"\n enter sport fees:";
		cin>>fees;
	}	
};
#endif
