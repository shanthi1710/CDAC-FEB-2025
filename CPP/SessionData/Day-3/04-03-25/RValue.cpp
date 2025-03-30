#include<iostream>
using namespace std;
void printData(const int i){

	i= i+i;
	cout<<i;
}
int main()
{
	//int a = printData(5);
	printData(5);

	return 0;
}
