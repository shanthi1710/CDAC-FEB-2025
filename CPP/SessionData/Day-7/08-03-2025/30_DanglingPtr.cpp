#include<iostream>
using namespace std;
int main()
{
	int *p1 = new int;
	int *p2 = p1;
	*p2=100;
	cout<<*p1<<endl;
	delete p2;
	cout<<*p1<<endl; // Segmentation fault // p1 is dangling pointer
	delete p1;
return 0;
}
