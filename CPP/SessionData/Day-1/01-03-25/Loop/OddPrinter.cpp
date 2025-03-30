#include<iostream>
using namespace std;
int main()
{
	int no;
	cout<<"\n Enter number"<<endl;
	cin>>no;
	for(int oddNo =1, i=0; i<no,oddNo<1000; i++, oddNo = oddNo +2)
	{
	cout<<"\n"<<oddNo;
	}
	return 0;
}
