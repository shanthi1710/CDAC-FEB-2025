#include<iostream>
using namespace std;
int main(){                              
	int* arrOfPtr[3],  r =3, c=2;



	for( int i =0;  i <r ; i++){
	arrOfPtr[i] = new int[c];
	cout<<"\n"<<arrOfPtr[i];
	}


	for( int i=0; i < r; i++)
	{
		for( int j=0; j < c ; j++)
		{
			cout<<"\n Enter element"<<endl;
			cin>>arrOfPtr[i][j];
		}
	}
	cout<<"\n Elements are..."<<endl;
	for( int i=0; i < r; i++)
	{
		for( int j=0; j < c ; j++)
		{
			cout<<"\n"<<arrOfPtr[i][j];
		}
	}
	
	for( int i =0;  i <r ; i++){
	cout<<"\n"<<arrOfPtr[i];
	delete []arrOfPtr[i];
	}
	
	return 0;
}
