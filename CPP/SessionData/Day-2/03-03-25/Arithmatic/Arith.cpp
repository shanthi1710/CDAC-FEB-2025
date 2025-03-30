#include<iostream>
using namespace std;

// a and b are formal args
int Add( int a, int b)
{
	//Load time var
	static int counter = 0;
	//Local var
	int sum = 0;
	sum = a + b;
	counter++;
	return sum;
}

int main()
{
	int no1, no2;
	cout<<"\n Enter 2 nos:"<<endl;
	cin>>no1;
	cin>>no2;
	int res = Add(no1, no2);
	cout<<"\n Sum = "<<res;
	return 0;
}
