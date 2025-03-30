#include<iostream>
using namespace std;

class Complex
{
	private:
	int real;
	int img;
	

	public:
	//Default ctor with initialization list
	Complex(): real(0), img(0)
	{
	}

	void Accept()
	{
	cout<<"\n Please enter real and img data"<<endl;
	cin>>real;
	cin>>img;
	}
	void Display() const
	{
	cout<<"\n Complex["<<real<<"+j"<<img<<"]"<<endl;
	}



};


int main()
{
	Complex c1;
	c1.Accept();
	c1.Display();
	return 0;
}
