#include<fstream>
#include<iostream>
using namespace std;

//Program to read from console and write it to file.
int main()
{
    ofstream fout;
    fout.open("abc.txt");
   
// ofstream fout("abc.txt");
	if(!fout)
	{
	 cout<<"\n unable to open file"<<endl;
	 return 1;
 	}
  
 	char ch;
	string str;
	do
	{
	cout<<"\n Enter string"<<endl;
	getline(cin,str);
	fout<<str;
	cout<<"\n Do u want to continue (y or n)"<<endl;
	cin>>ch;
	cin.get();// erase or eat the extra enter 
	}while(ch !='n');
  	
	fout.close();
    return 0;
}

