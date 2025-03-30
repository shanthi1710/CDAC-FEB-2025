#include<iostream>
using namespace std;

int main()
{
	float per =0;
	int a,b;
	a = 125;
	b = 3;
	per = a;
	per = a/b;
	cout<<"\n answer="<<float(a)/b;
	cout<<"\n answer="<<a/(float)b;
	cout<<"\n answer="<<float(a/b);
	per =(float)a/b;
	cout<<"\n value of Per is:="<<per;
	per =(float)(a/b);
	cout<<"\n value of Per is:="<<per;
       if(per >40,per= 20, per<40)	
       //if( per >= 40)
       {
	 cout<<"\n Pass \n";
       }
       else
       {
	cout<<"\n fail\n";
       }
	return 0;
}
