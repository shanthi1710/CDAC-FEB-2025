#include<iostream>
using namespace std;

class Complex
{
	private:
	int real;
	int img;
	//static DM
	static int count;
	

	public:
	//Default ctor with initialization list
	Complex(): real(0), img(0)
	{
		count++;
		cout<<"\n Complex::Complex"<<endl;
	}
	// Param ctor
	Complex(int real, int img): real(real), img(img)
	{
		count++;
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

	//Accessor
	int GetReal() {
		return this->real;
	}

	//Mutator
	void SetReal(int r) {
		this->real = r;
	}

	static int GetCount() {

		return count;
	}


};

//Static DM Init
int Complex::count(0);

int main()
{
	Complex c1(30,60);
	Complex carr[10];
//	c1.Accept();
//	int a = c1.GetReal();
	cout<<c1.GetReal()<<endl;
	c1.SetReal(100);
	cout<<c1.GetReal();
	cout<<"\n count="<< Complex::GetCount();
//	c1.Display();
	return 0;
}
