#include<stdio.h>
int main()
{
unsigned int addr;
int k =10;
addr =(unsigned int)&k; // Allowed as &k is unsigned int
printf("%u", addr);
return 0;
}
