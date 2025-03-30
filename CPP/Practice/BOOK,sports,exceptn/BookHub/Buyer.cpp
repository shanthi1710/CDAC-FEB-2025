#include<iostream>
#include<string>
#include"User.cpp"
#include"Item.cpp"
#include<vector>
using namespace std;

class Buyer : public User
{
	private:
	string contNo;
	vector<Item> purItem;
	
	public:
	Buyer()
	{}
	Buyer(string name,string contNo):User::User(name)
	{
		contNo=contNo;
	}
	
	string getContNo()
	{
		return contNo;
	}
	
	void disPurItem()
	{
		vector<Item> :: iterator itr=purItem.begin();
		while(itr!=purItem.end())
		{
			itr->display();
			itr++;
		}
	}
	
	void addBuyer()
	{
		cout<<"\nEnter Buyer datails:";
		User::addUser();
		cout<<"\nEnter Contact no:";
		cin>>contNo;
	}
	
	void display()
	{
		cout<<"\nBuyer Details are:"<<endl;
		User::display();
		cout<<"\nCont No :"<<this->contNo<<endl;
		
	}
	
	void buyItem(vector<Item> vi,int id)
	{
		vector<Item>::iterator itr = vi.begin();
		while(itr!=vi.end())
		{
			if(id==((*itr).getId()))
			{
				this->purItem.push_back(*itr);
			}
			itr++;
		}
		
	}
		
	
		
		
	
};
