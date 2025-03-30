#include<iostream>
#include"FBPlayer.h"
using namespace std;
FBPlayer::FBPlayer():goals(0)
{
cout<<"\nFBPlayer::FBPlayer()"<<endl;
}
FBPlayer::FBPlayer(string name, int age,int goals): Player::Player(name, age), goals(goals)
{
cout<<"\n FBPlayer::FBPlayer(int)"<<endl;
}
void FBPlayer::Accept()
{
	Player::Accept();
	cout<<"\n Please enter goals"<<endl;
	cin>>goals;
}

void FBPlayer::Display()
{
	cout<<"\n FBPlayer data"<<endl;
	Player::Display();
	cout<<"\n [Goals="<<goals<<"]"<<endl;
}
