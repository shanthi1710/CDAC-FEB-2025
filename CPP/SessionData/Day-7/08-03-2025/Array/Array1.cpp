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
	Array *ap = new Array(2);
	ap->SetAtIndex(0, 10);
	ap->SetAtIndex(1, 20);
	ap->Display();
	delete ap;
	return 0;
}
