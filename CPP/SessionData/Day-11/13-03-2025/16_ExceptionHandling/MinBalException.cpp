#include<iostream>
#include<string>
#include<stdexcept>
using namespace std;

class MinBalException : public runtime_error
{
 string strMessage;

public:
MinBalException(string x):runtime_error(x),strMessage(x)
{
}

//Overiddn what function
string what()
{
return strMessage;
}

};

float  withdraw(float accBal, float amt)
{
if(accBal <= 500)
{
throw MinBalException("Min bal violated");
}
return accBal - amt;
}

int main()
{

try
{
withdraw(1500, 10);

}
catch(MinBalException e)
{
cout<<e.what();
}

return 0;
}
