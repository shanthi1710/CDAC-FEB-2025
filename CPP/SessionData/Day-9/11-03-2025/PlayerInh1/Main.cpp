#include<iostream>
#include"CktPlayer.h"
#include"FBPlayer.h"
using namespace std;
void polymorphic1(Player &rp)
{
	rp.Display();
}

void polymorphic2(Player *pp)
{
	pp->Display();
}

int main()
{
	CktPlayer c("Sachin", 45, 100);
	FBPlayer f("Anyone", 45, 100);
	polymorphic1(c);
	polymorphic1(f);

	polymorphic2(&c);
	polymorphic2(&f);
	return 0;
}

/*int main()
{

	Player p;
	p.Display();
	

	CktPlayer c("Sachin", 45, 100);
	c.Display();
	FBPlayer f("Anyone", 45, 100);
	f.Display();

	Player *pp = &c; //Upcasting
	//LHS => Player *
	//RHS => Cktplayer *
	pp->Display();

	pp = &f;
	pp->Display();
	
	//Player &pr = c; //upcasting 
	//LHS => Player
	//RHS => CktPlayer
	
	return 0;
}*/
