#include<iostream>
#include<string>
using namespace std;

int main()
{
	//void v;
	int i =10;
	void *vp;
	vp = &i;
	char c;
	vp = &c;
	*vp = 100;
	cout<<"\n "<<*vp;

	cout<<"\n Size ptr="<<sizeof(unsigned int);
	cout<<"\n Size ptr="<<sizeof(void*);
	cout<<"\n Size ptr="<<sizeof(int*);
	cout<<"\n Size ptr="<<sizeof(string*);
	cout<<"\n Size="<<sizeof(void);
	return 0;
}
