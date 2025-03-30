#include<iostream>
#include"Complex.h"
using namespace std;

	//Default ctor with initialization list
Complex::Complex(): real(0), img(0)
{
cout<<"\n Complex::Complex"<<endl;
}
// Param ctor
Complex::Complex(int real, int img): real(real), img(img)
{
	cout<<"\n Complex::Complex(int, int)"<<endl;
}

void Complex::Accept()
{
cout<<"\n Please enter real and img data"<<endl;
cin>>real;
cin>>img;
}

void Complex::Display() const
{
cout<<"\n Complex["<<real<<"+j"<<img<<"]"<<endl;
}

Complex Complex::Add(const Complex temp) const
{
//Perform addition of (*this) and temp
 return Complex(this->real + temp.real, this->img + temp.img);		
}

Complex Complex::operator+(const Complex temp) const
{
//Perform addition of (*this) and temp
 return Complex(this->real + temp.real, this->img + temp.img);		
}
