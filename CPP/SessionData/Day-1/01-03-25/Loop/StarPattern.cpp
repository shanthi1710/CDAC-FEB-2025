#include<iostream>
using namespace std;

int main()
{
	 int n=0;
	 cout<<"Enter any number:";
	 cin>>n;
	 for(int i=1;i<=n;i++)
	 {
		cout<<"\n";
	 	for(int j=1;j<=i;j++)
	 	{	
	 	cout<<"*";
		}
	 }
	 cout<<"\n";
	return 0;
}
