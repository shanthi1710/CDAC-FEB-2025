#include<iostream>
using namespace std;
int main()
{
unsigned int addr;
int k =10;
addr =(unsigned int)&k; // Allowed as &k is unsigned int
cout<<addr;
return 0;
}
