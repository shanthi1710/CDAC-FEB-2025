#include<iostream>
using namespace std;
int main()
{
	 int n=0;
	 cout<<"Enter any number:";
	 cin>>n;
	 int i;
	 for(i=1;i<n;i=i+1)
	 {
		if(i%2 ==0)
		{		
	 	cout<<"\n"<<i;
		}
	 }
	return 0;
}
