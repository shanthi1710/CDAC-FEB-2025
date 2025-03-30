#include<iostream>
using namespace std;

void leakFunction()
{
int *p = new int [500000000];
delete []p;
}
int main(){
	for( int i =0; i <8000000; i++) {
		leakFunction();
	}

	int *p = new int;
	*p = 10;
	cout<<*p;
	delete p;

	return 0;
} 
	
	
	
