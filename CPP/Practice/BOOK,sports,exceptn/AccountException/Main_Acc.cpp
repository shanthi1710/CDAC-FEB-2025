#include<iostream>
#include<string>
#include"Account.cpp"
#include<vector>
using namespace std;
int Account::count(0);
int main()
{
	
	vector<Account> accnt;
	
	int choice;
	
	do
	{
		cout<<"\nEnter 1-Create account";
		cout<<"\nEnter 2-Display all account";
		cout<<"\nEnter 3-Display account with accnt no";
		cout<<"\nEnter 4-Withdraw Amount";
		cout<<"\nEnter 5-Deposite Amount";
		cout<<"\nEnter 0-Exit"<<endl;
		
		cin>>choice;
		
		switch(choice)
		{
			case 1:
				{
					Account c1;
					c1.accept();
					accnt.push_back(c1);
				}
				break;
			case 2:
				{
					vector<Account> :: iterator itr=accnt.begin();
					while(itr!=accnt.end())
					{
						(*itr).display();
						itr++;
					}
				}
				break;
			case 3:
				{
					int a;
					cout<<"\nEnter Account No : ";
					cin>>a;
					vector<Account> :: iterator itr=accnt.begin();
					while(itr!=accnt.end())
					{
						if(a==(*itr).getAccnt())
						{
							(*itr).display();
						}
						itr++;
					}
				}
				break;
			case 4:
				{
					int a;
					cout<<"\nEnter Account No : ";
					cin>>a;
					vector<Account> :: iterator itr=accnt.begin();
					while(itr!=accnt.end())
					{
						if(a==(*itr).getAccnt())
						{
							(*itr).withdraw();
						}
						itr++;
					}
				}
				break;	
			case 5:
				{
					int a;
					cout<<"\nEnter Account No : ";
					cin>>a;
					vector<Account> :: iterator itr=accnt.begin();
					while(itr!=accnt.end())
					{
						if(a==(*itr).getAccnt())
						{
							(*itr).deposite();
						}
						itr++;
					}
				}
				break;
			case 0:
				{
					choice=0;
				}
				break;
			default:
				{
					cout<<"\nPlease enter correct input"<<endl;
				}
		}
	}while(choice!=0);
	
	return 0;
}
