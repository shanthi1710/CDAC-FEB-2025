#include<iostream>
using namespace std;
template<class T>
void Swap(T &x, T &y)
{
     T temp = x;
     x = y; 
     y = temp;
}

int main()
{ 
 double p=10.20, k=20.10;
 Swap(p,k);
 cout<<"\n"<<p<<" "<<k;
 int a=10, b=20;
 Swap(a,b);
 cout<<"\n"<<a<<" "<<b;
return 0; }
