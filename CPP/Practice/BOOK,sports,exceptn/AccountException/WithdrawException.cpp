#include<iostream>
#include<string>
#include<stdexcept>
using namespace std;

class MinBalException : public exception 
{
	private:
	string msg;
	
	public:
	MinBalException(const char* msg): msg(msg)
	{
	}
	
};


