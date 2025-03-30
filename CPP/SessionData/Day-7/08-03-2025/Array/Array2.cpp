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

		void SetAtIndex(int index, int value)
		{
			p[index] = value;
		}

		void Display()
		{
//			cout<<"\n size="<<size;
//			cout<<"\n p="<<p;
			cout<<"\n Array elements"<<endl;
			for(int i =0 ; i < size; i++) {
				cout<<"\n "<<p[i];// *(p+i)
			}
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
	a.SetAtIndex(0, 10);
	a.SetAtIndex(1, 20);
	a.Display();
	{
	//copy ctor
	Array b(a);
	b.Display();
	}
	a.Display();

	return 0;
}
