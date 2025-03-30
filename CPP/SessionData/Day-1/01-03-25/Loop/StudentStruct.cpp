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
//Student s;
Student sarr[2];
//cout<<"\n Size ="<<sizeof(s);
for(int i=0; i<2; i++)
{
cout<<"\n Enter RollNo"<<endl;
cin>>sarr[i].rno;
cout<<"\n Enter name"<<endl;
cin>>sarr[i].name;
}

for(int i=0; i<2; i++)
{
cout<<"\n RollNo:"<<sarr[i].rno <<"\t Name:"<<sarr[i].name;
}

return 0;
}
