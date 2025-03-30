#include<iostream>
#include<string>
#include"Sports.cpp"
#include"IndoorGame.cpp"
#include"OutdoorGame.cpp"
#include<vector>
using namespace std;

class Player
{
	
	private:
	int playerId;
	static int count;
	string pname;
	vector<Sports> sportslist;
	
	public:
	
	Player()
	{
		count++;
		this->playerId=count;
	}
	
	Player(string name,vector<Sports> sportslist)
	{
		this->pname=name;
		this->sportslist=sportslist;
		count++;
		this->playerId=count;
	}
	
	void display()
	{
		cout<<"\nPalyer Details\n";
		cout<<"\nPlayer ID :"<<this->playerId;
		cout<<"\nPlayer Name :"<<this->pname;
		cout<<"\nPlayed Sports List\n";
		showSports(); 
		
	}
	
	void showSports()
	{
		vector<Sports> :: iterator itr=sportslist.begin();
		while(itr!=sportslist.end())
		{
			(*itr).display();
			itr++;
		}
	}
	
	
	void addPlayer()
	{
		cout<<"\nEnter Player Name :";
		cin>>pname;
	}
	
	void addSport()
	{
		int ch;
		
		cout<<"\nEnter Choice : IndoorGames=1 OutdoorGame=2"<<endl;
		cin>>ch;
		if(ch==1)
		{
			IndoorGame ig;
			ig.accept();
			sportslist.push_back(ig);
		}
		else if(ch==2)
		{
			
			OutdoorGame og;
			og.accept();
			sportslist.push_back(og);
		}
		else
		{
			cout<<"\n You Enterd wrong input\n";
		}
		
	}	
	
	int getPlayerId()
	{
		return this->playerId;
	}	
};
	
	
	
	
	
