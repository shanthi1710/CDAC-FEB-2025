#include<iostream>
#include<string>
#include<vector>
#include"Item.cpp"
#include"User.cpp"
#include"Buyer.cpp"

using namespace std;

int main()
{
	vector<Item> items;
	vector<Buyer> buyers;
	
	int num;
	do
	{
		cout<<"\n1-Add new Item";
		cout<<"\n2-Add new Buyer";
		cout<<"\n3-Display Items";
		cout<<"\n4-Buy Items with id of Item";
		cout<<"\n5-Pursched Items for Buyer";
		cout<<"\n0-For stop"<<endl;
		
		cin>>num;
		
		switch(num)
		{
			case 1:
				{
					Item i;
					i.accept();
					items.push_back(i);
				}
				break;
			case 2:
				{
					Buyer b;
					b.addBuyer();
					buyers.push_back(b);
				}
				break;
			case 3:
				{
					vector<Item> :: iterator itr=items.begin();
					while(itr!=items.end())
					{
						itr->display();
						itr++;
					}
				}
				break;
			case 4:
				{
					int x;
					string y;
					cout<<"\nEnter your contactno:";
					cin>>y;
					cout<<"\nEnter your Item id:";
					cin>>x;
					vector<Buyer> :: iterator itr=buyers.begin();
					while(itr!=buyers.end())
					{
						if(y==(itr->getContNo()))
						{
							(*itr).buyItem(items,x);
							
						}
						itr++;
					}
		
				}
				break;
			case 5:
				{
					string cno;
					cout<<"\nEnter contct No:";
					cin>>cno;
					vector<Buyer> :: iterator itr=buyers.begin();
					while(itr!=buyers.end())
					{
						if(cno==(itr->getContNo()))
						{
							(*itr).disPurItem();
						}
						itr++;
					}
				}
				break;
			case 0:
				{
					num=0;
				}
				break;
			default:
				{
					cout<<"\nPlease enter correct input"<<endl;
				}
		}
	}while(num!=0);
	
	return 0;
}
