#include<isostream>
using namespace std;
 int main()
{
	 int n=0;
	 int fact=1;
	 cout<<Enter any number:";
	 cin>>n;

	 while(n!=0)
	 {
		 fact= fact*n;
		 n= n-1;
	 }

	 cout<<Fact="<<fact;
	return 0;
}
