#include<iostream>
#include<string>
#include"Sports.cpp"
using namespace std;

class IndoorGame : public Sports
{
	private:
	string venueType;
	
	public:
	
	IndoorGame():Sports::Sports()
	{}
	
	IndoorGame(string venueType,string name,int fees):Sports::Sports(name,fees)
	{
		this->venueType=venueType;
	}
	
	void display()
	{
		cout<<"\nIndoorSports Details\n";
		Sports::display();
		cout<<"\n Sport Venue Type="<<this->venueType<<endl;
		
	}
	
	void accept()
	{
		cout<<"\nEnter IndoorSports Details\n";
		Sports::accept();
		cout<<"\nEnter Sport VenueType:";
		cin>>venueType;
		
	}	
};
