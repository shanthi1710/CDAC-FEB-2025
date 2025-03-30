#include "Rect.h"
#include "Circle.h"
int main()
{

	Shape *s = nullptr;
    	Rect r;
	Circle c;
	//Rectanle function
	s = &r; // upcasting
	s->Accept();
    
	float a= s->CalcArea();
    	cout<<"\n Area is ="<<a;
	
	//Circle function
	s = &c; // upcasting
	s->Accept();
	a= s->CalcArea();
	cout<<"\n Area is ="<<a;
	
	
	return 0;

}
