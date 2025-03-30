#include<string>
#include"Player.h"
using namespace std;
class CktPlayer : public Player
{
	private:
		int runs;

	public:
		CktPlayer();
		CktPlayer(int);
		void Accept();
		void Display();
};
