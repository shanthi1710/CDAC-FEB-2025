#include<bits/stdc++.h>

using namespace std;

int find(int dec){
  if(dec == 0 )
	  return 0;
  else {
	  return (dec % 2 + 10 * find (dec / 2)) ;
  }
}

int main(){
	int dec;
	cout<<"Enter Dec Num : "<<endl;
	cin>>dec;
	cout<<"binary : "<<find(dec)<<endl;
	return 0;
}
