#include<iostream>
#include"Student.h"
using namespace std;
template<class T>
class Array
{
	private:
		//Storage holder
		T *p;
		int size;
	public:
		Array(int size)
		{
		cout<<"\nCtor"<<endl;
		// init size
		this->size = size;
		//Allocate memory
		this->p =  new T[this->size];;
		}

		Array(const Array& x)
		{//Array b(a); x---> a and  this -->b
		 cout<<"\n copy ctor"<<endl;
			//copy size
			this->size = x.size;
			//Allocate memory with given size
			this->p = new T [this->size];
			//copy contents
			for(int i =0; i <this->size; i++)
			{
				this->p[i]= x.p[i];
			}
		}


		T& operator[](int index)
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
