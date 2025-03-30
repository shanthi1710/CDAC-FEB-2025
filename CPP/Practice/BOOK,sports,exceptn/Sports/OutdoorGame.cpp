#include<iostream>
#include<string>
#include"Sports.cpp"

using namespace std;

class OutdoorGame : public Sports
{
	private:
	string groundType;
	
	public:
	
	OutdoorGame():Sports::Sports()
	{}
	
	OutdoorGame(string groundType,string name,int fees):Sports::Sports(name,fees)
	{
		this->groundType=groundType;
	}
	
	void display()
	{
		cout<<"\nOutdoorSports Details\n";
		Sports::display();
		cout<<"\n Sport Ground Type="<<this->groundType<<endl;
		
	}
	
	void accept()
	{
		cout<<"\nEnter OutdoorSports Details\n";
		Sports::accept();
		cout<<"\nEnter Sport GroundType:";
		cin>>groundType;
		
	}	
};
