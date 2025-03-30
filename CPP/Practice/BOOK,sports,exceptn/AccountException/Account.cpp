#include<iostream>
#include<string>
#include"WithdrawException.cpp"
using namespace std;

class Account
{
	private:
	static int count;
	int accNo;
	string name;
	long int balance;
	
	public:
	
	Account()
	{
		count++;
		accNo=count;
	}
	
	Account(int accNo,string name,long int balance):accNo(accNo),name(name),balance(balance)
	{
		count++;
		accNo=count;
	}
	
	void accept()
	{
		cout<<"\nEnter Account Details"<<endl;
		cout<<"\nEnter name :";
		cin>>name;
		cout<<"\nEnter balance:";
		cin>>balance;
	}
	
	void display()
	{
		cout<<"\nAccount details are:\n";
		cout<<"\nAccount No="<<this->accNo;
		cout<<"\nAccount Name="<<this->name;
		cout<<"\nAccount Balance="<<this->balance<<endl;
	}
	
	string getName()
	{
		return this->name;
	}
	
	int getAccnt()
	{
		return this->accNo;
	}
	
	long int getBal()
	{
		return this->balance;
	}
	
	void withdraw()
	{
		long int withAmt;
		cout<<"\nEnter withdraw amount=";
		cin>>withAmt; 
		if((this->balance - withAmt)<1000)
		{
			throw MinBalException("Minimum balance Exception!!");
		}
		else
		{
			this->balance=this->balance-withAmt;
			cout<<"\nWithdrawed amount ="<<withAmt;
			cout<<"\nAccoun details after withdraw\n";
			display();
		}
	}
		
	void deposite()
	{
		long int depAmt;
		cout<<"\nEnter deposite amount=";
		cin>>depAmt; 
		if((this->balance + depAmt)>=50000)
		{
			
		}
		else
		{
			this->balance=this->balance+depAmt;
			cout<<"\nDeposited amount ="<<depAmt;
			cout<<"\nAccoun details after Deposite\n";
			display();
		}
	}
		
};	
		
		
		
		
		
		
		
		
		
		
		
				
