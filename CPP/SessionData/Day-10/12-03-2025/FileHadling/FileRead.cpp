#include<fstream>
#include<iostream>
#include<string>
using namespace std;

//Program to read from file and write it to console.
int main()
{
    ifstream fin;
    fin.open("abc.txt");
   
// ifstream fin("abc.txt");
	if(!fin)
	{
	 cout<<"\n unable to open file"<<endl;
	 return 1;

 	}
  
 	char ch;
	string str;
	//while(!fin.eof())
	while(fin)
	{
//Using char
	/*fin>>ch;
	cout<<ch;
*/

//Using string
	getline(fin,str);
	cout<<str;
	}
  	
	fin.close();
    return 0;
}

