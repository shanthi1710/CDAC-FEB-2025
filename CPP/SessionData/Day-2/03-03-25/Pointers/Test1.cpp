#include<iostream>
using namespace std;

int main()
{
	int k = 100;
	int j = 50;
	//int * const p = nullptr;
	int * const p = &k;
	k++;

	cout<<*p;
//	p  = &j;
	cout<<&p<<endl;
	cout<<&p<<endl;
//	p = &k;
	cout<<&p<<endl;
	cout<<*p<<endl;
	return 0;
}
