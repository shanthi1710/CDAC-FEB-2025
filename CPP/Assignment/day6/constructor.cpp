#include<bits/stdc++.h>
 using namespace std;

class Student{
   private:
	 string name;
	 int age;
	 int rollNo;
   public:
	 Student(){
	   name = "";

	 }

	 Student(int rollNo, string name, int age){
	        this->rollNo = rollNo;
		this->age = age;
		this->name = name;
	 }

	  void display(){
  		cout<<"Roll No. : "<<rollNo<<"\tName : "<<name<<"\tAge : "<<age<<endl;
	  }
	  void accept(){
 		cout<<"Enter details : "<<endl;
	        cout<<"Enter roll number : ";
		cin>>rollNo;
		cout<<"Enter name : ";
		cin>>name;
		cout<<"Enter age : ";
		cin>>age;

	  }
};


int main(){
	Student s1;
	Student s2(1,"Tejas",24);
	s1.display();


	return 0;

}
