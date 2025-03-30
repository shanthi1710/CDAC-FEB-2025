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
		cout<<"\n Complex::Complex"<<endl;
	}
	Complex(int real, int img): real(real), img(img)
	{
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
	Complex *cp1 = new Complex;
	//TODO
	delete cp1;

	Complex c2(10, 10);
	Complex *cp2 = new Complex(10, 10);
	//TODO
	delete cp2;

	//Copy ctor
	Complex c3(c1);
	Complex c4 = c1;
	Complex c5 = Complex(10, 10);

	//Normal array
	Complex carr[10];
//	carr[0]
	//Dynamic array
	Complex *cptr = new Complex[10];
	//cptr[0]
	delete []p;

//	cp->Display();
//	c1.Accept();
//	c1.Display();
	return 0;
}
