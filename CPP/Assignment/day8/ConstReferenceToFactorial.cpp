#include<iostream>

using namespace std;
int fact(int n){
    if(n==0 || n == 1){
        return 1;
    }
    //n = n -1; this line give error
    return n * fact(n-1);
}
int main(){
	int num;

    int const &n=num;
    cout<<"Enter number:->";
    cin>>num;
    int res = fact(num);
    cout<<"Factorial:->"<<res<<endl;
    return 0; 
}
