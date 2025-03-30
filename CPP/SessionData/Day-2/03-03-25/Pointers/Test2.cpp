#include<iostream>
using namespace std;

int main()
{
	int k = 100;
	const int j = 50;

	const int * const p = &j;
	p++;
	(*p)++;
	j++;
	cout<<&p<<endl;
	cout<<*p<<endl;
	return 0;
}
