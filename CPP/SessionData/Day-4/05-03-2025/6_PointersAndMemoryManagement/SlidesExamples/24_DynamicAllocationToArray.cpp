#include<iostream>
using namespace std;
int main(){
 	int * const p = new int[4]; // Allocation of memory for array
	int k =100;
	int *fp = &k;
	fp = p;
	p = fp;


	//p = NULL;
	for(int i =1; i<=4; i++){//  Loop for initializing array elements
	p[i]=i*10; }
	for(int i =1; i<=4; i++){ //  Loop for printing array elements
	cout<< p[i]<<endl; }
	delete []p;  // De-allocation of memory
	return 0;
}
