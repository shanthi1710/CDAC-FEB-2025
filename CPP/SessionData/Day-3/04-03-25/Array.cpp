#include<iostream>
using namespace std;
int main()
{
	int size;
	cout<<"\n Enter size"<<endl;
	cin>>size;

	int arr[size];

	cout<<"\n Enter elements"<<endl;
	for( int i =0; i < size ; i++)
	{
		cin>>arr[i];

	}
	cout<<"\nElements are:"<<endl;
	for( int i =0; i < size ; i++)
	{
		cout<<arr[i];

	}
	return 0;
}
