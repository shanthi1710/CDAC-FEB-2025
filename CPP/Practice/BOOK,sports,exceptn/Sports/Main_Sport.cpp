#include<string>
#include<iostream>
#include<vector>
#include"Player.cpp"
#include"Sports.cpp"
//#include"IndoorGame.cpp"
//#include"OutdoorGame.cpp"	
using namespace std;	

 int Player::count(0);
int main()
{
	vector<Player> players;
	vector<Sports> sports;
	int ch;
	do
	{
		cout<<"\n1-Add Player";
		cout<<"\n2-Add Sports";
		cout<<"\n3-Display Player ";
		cout<<"\n4-Display Sports";
		//cout<<"\n5-Display Players with Indoor Games";
		//cout<<"\n6-Display Players with outdoor Games";
		cout<<"\n0-Stop"<<endl;
		
		cin>>ch;
		
		switch(ch)
		{
			case 1:
				{
					Player p;
					p.addPlayer();
					int x;
					do
					{
						p.addSport();
						cout<<"\nEnter 1 to add another sports details or 0 for stop\n";
						cin>>x;
					}while(x!=0);
					
					players.push_back(p);
					
				}
				break;
			case 2:
				{
					int ch;
		
					cout<<"\nEnter Choice : IndoorGames=1 OutdoorGame=2";
					cin>>ch;
					if(ch==1)
					{
						IndoorGame ig;
						ig.accept();
						sports.push_back(ig);
					}
					else if(ch==2)
					{
			
						OutdoorGame og;
						og.accept();
						sports.push_back(og);
					}
					else
					{
						cout<<"\n You Enterd wrong input\n";
					}
					
				}
				break;
			case 3:
				{
					vector<Player> :: iterator itr=players.begin();
					while(itr!=players.end())
					{
						(*itr).display();
						itr++;
					}
				}
				break;
			case 4:
				{
					vector<Sports> :: iterator itr=sports.begin();
					while(itr!=sports.end())
					{
						(*itr).display();
						itr++;
					}
				}
				break;
		/*	case 5:
				{}
				break;
			case 6:
				{
					
				}
				break;*/
			case 0:
				{
					ch=0;
				}
				break;
			default:
				{
					cout<<"\nPlease enter valid input"<<endl;
				}
		}
	}while(ch!=0);
	return 0;				
}

