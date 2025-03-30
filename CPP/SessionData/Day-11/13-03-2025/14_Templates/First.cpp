// First.cpp : Defines the entry point for the console application.
#include<iostream>
#include<fstream>
using namespace std;

class Swap
{
public:
template<class T>
void swap(T& a,T& b)
	{
		T temp;
		temp=a;
		a= b;
		b=temp;

	}
};

int main()
{
	cout<<"\n Swapping program"<<endl;
	Swap s;
	float i=20.20;
	float j=40.40;
	s.swap(i,j);
	cout<<"\n I="<<i;
	cout<<"\n J="<<j;

	int p=20;
	int k=40;
	s.swap(p,k);
	cout<<"\n p="<<p;
	cout<<"\n k="<<k;

	return 0;
}
