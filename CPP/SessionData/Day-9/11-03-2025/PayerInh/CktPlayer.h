#include<string>
#include"Player.h"
using namespace std;
class CktPlayer : public Player
{
	private:
		int runs;

	public:
		CktPlayer();
		CktPlayer(string, int, int);
		void Accept();
		void Display();
		~CktPlayer();
};
