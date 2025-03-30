#include<string>
#include"Player.h"
using namespace std;
class FBPlayer : public Player
{
	private:
		int goals;

	public:
		FBPlayer();
		FBPlayer(string, int, int);
		void Accept();
		void Display();
};
