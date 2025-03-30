#include<iostream>
using namespace std;

class Array
{
	private:
		//Storage holder
		int *p;
		int size;
	public:
		Array(int size)
		{
		cout<<"\nCtor"<<endl;
		// init size
		this->size = size;
		//Allocate memory
		this->p =  new int[this->size];;
		}

		Array(const Array& x)
		{//Array b(a); x---> a and  this -->b
		 cout<<"\n copy ctor"<<endl;
			//copy size
			this->size = x.size;
			//Allocate memory with given size
			this->p = new int [this->size];
			//copy contents
			for(int i =0; i <this->size; i++)
			{
				this->p[i]= x.p[i];
			}
		}


		int& operator[](int index)
		{
			return 	p[index];
		}

		~Array()
		{
			cout<<"\nDtor"<<endl;
			delete []p;
		}
};

int main()
{
	Array a(2);
	a[0] = 10;
//	a.operator[](0)= 10;
	a[1] = 20;
	cout<<"\n Value="<<a[0];//internally ref of p[0]
	cout<<"\n Value="<<a[1];//internally ref of p[1]

	return 0;
}
