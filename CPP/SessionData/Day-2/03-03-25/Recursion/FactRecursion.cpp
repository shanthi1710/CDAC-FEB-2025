#include<iostream>
using namespace std;
int factorial(int no)
{
    if(no > 1)
    {
	    cout<<"\n Address="<<&no;
		return no * factorial(no-1);
    } else {
		return 1;
	}
}
int main()
{
    int a=3;
    int fact = factorial(a);
	cout<<"\n Factorial Value="<<fact;
    return 0;
}

