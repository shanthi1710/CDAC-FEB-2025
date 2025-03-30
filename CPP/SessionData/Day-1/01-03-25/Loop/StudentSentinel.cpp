#include<iostream>
#include<string>
using namespace std;

struct Student
{
int rno;
string name;
};

int main()
{
Student sarr[240];

int i =0;
char c = 'N';
cout<<"\n Student Input"<<endl;
do
{
	cout<<"\n Enter RollNo"<<endl;
	cin>>sarr[i].rno;
	
	cout<<"\n Enter name"<<endl;
	cin>>sarr[i].name;
	i++;

	cout<<"\n Do you want to add one more student:Y or N?"<<endl;

	cin>>c;
} while(c != 'N');


cout<<"\n Student details"<<endl;
for(int j=0; j<i; j++)
{
cout<<"\n RollNo:"<<sarr[j].rno <<"\t Name:"<<sarr[j].name;
}

return 0;
}
