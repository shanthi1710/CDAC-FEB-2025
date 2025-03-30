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
	// Param ctor
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

	/*Complex Add(const Complex temp) const
       	{
		//Perform addition of (*this) and temp
		Complex result;
		result.real = this->real + temp.real;
		result.img = this->img + temp.img;
		return result;
	}*/
	Complex Add(const Complex temp) const
       	{
		//Perform addition of (*this) and temp
 return Complex(this->real + temp.real, this->img + temp.img);		
	}

	~Complex()
	{//clean up costly resources
	 cout<<"Destructor"<<endl;
	}

};


int main()
{
	Complex c1(10, 10), c2(20, 20);
	Complex c3;
	c3 = c1.Add(c2);
	c3.Display();
	return 0;
}
