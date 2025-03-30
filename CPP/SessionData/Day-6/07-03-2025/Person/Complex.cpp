#include<iostream>
using namespace std;

class Complex
{
	private:
	int real;
	int img;
	const int c;// Constant DM
	

	public:
	//Default ctor with initialization list
	/*Complex(): real(0), img(0)
	{
		cout<<"\n Complex::Complex"<<endl;
	}*/
	Complex(): c(10)
	{
		real = 0;
		img = 0;
//		c = 10;
		cout<<"\n Complex::Complex"<<endl;
	}
	// Param ctor
	Complex(int real, int img): real(real), img(img), c(10)
	{
//		c = 10;
		cout<<"\n Complex::Complex(int, int)"<<endl;
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
