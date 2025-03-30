#include<iostream>
#include"Array1.cpp"
using namespace std;

int main()
{
	Array<int> a(2);
	a[0] = 10;
	a[1] = 20;
	cout<<"\n Value="<<a[0];
	cout<<"\n Value="<<a[1];
	
	Array<float> b(2);
	b[0] = 10.236423;
	b[1] = 20.12672;
	cout<<"\n Value="<<b[0];
	cout<<"\n Value="<<b[1];

	Array<Student> arr(2);
	Student s;
	s.Accept();
	arr[0] = s;
	arr[0].Display();
				

	return 0;
}
