#include<iostream>
#include"CktPlayer.h"
using namespace std;
CktPlayer::CktPlayer():runs(0)
{
cout<<"\nCktPlayer::CktPlayer()"<<endl;
}
CktPlayer::CktPlayer(string name, int age,int runs): Player::Player(name, age), runs(runs)
{
cout<<"\n CktPlayer::CktPlayer(int)"<<endl;
}
void CktPlayer::Accept()
{
	Player::Accept();
	cout<<"\n Please enter runs"<<endl;
	cin>>runs;
}

void CktPlayer::Display()
{
	cout<<"\n CktPlayer data"<<endl;
	this->Player::Display();
	cout<<"\n [Runs="<<runs<<"]"<<endl;
}
CktPlayer::~CktPlayer()
{
cout<<"\nCktPlayer::~CktPlayer()"<<endl;
}
