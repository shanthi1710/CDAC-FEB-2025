#include<iostream>
#include"CktPlayer.h"
using namespace std;
CktPlayer::CktPlayer():runs(0)
{
}
CktPlayer::CktPlayer(int runs) : runs(runs)
{
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
	cout<<this;
	cout<<"\n [Runs="<<runs<<"]"<<endl;
}
