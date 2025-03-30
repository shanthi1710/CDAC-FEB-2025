#include<isostream>
using namespace std;

int main()
{
char ch='a';
cout<<"\n Enter a character to proceed";
while(ch!= 'n')
{
cout<<"\n Entered char "<<ch;
cout<<"\n Enter char: ";
cin>>ch;
cin.get();
}
return  0;
}
