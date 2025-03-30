#include<iostream>
using namespace std;
int main(int argc, char *argv[], char *env[])
{
	cout<<argc<<endl;

	cout<<"\n *************"<<endl;
	cout<<argv[0]<<endl;
	cout<<argv[1]<<endl;
	cout<<argv[2]<<endl;

	cout<<"\n *************"<<endl;
	cout<<env[0]<<endl;
	cout<<env[1]<<endl;
	cout<<env[2]<<endl;
	return 0;
}
