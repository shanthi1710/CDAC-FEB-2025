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
//	cout<<"\n"<<sizeof(a);
	//a.p[0]= 10;
	a.SetAtIndex(0, 10);

	//a.p[1]= 20;
	a.SetAtIndex(1, 20);
	a.Display();
	return 0;
}
