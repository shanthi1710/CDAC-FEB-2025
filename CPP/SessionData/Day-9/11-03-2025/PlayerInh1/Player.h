#ifndef _____PLAYER___H________
#define _____PLAYER___H________
#include<string>
using namespace std;
class Player
{
	private:
		string name;
		int age;

	public:

		Player();
		Player(string, int);
		virtual void Accept();
		virtual void Display();
		~Player();
};
#endif
