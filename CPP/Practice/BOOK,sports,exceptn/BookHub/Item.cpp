#ifndef __ITEM_H_
#define __ITEM_H_
#include<iostream>
#include<string>

using namespace std;

class Item
{
	private:
	int id;
	string itemName;
	int price;
	
	public:
	Item()
	{}
	
	Item(int id,string itemName,int price)
	{
		this->id=id;
		this->itemName=itemName;
		this->price=price;
	}
	
	int getId()
	{
		return this->id;
	}
	
	string getItemName()
	{
		return this->itemName;
	}
	
	void display()
	{
		cout<<"\n Item detais :";
		cout<<"\n Item id:"<<this->id;
		cout<<"\n Item Name:"<<this->itemName;
		cout<<"\n Item price:"<<this->price;
	}
	
	void accept()
	{
		cout<<"\nEnter Item Details:";
		cout<<"\nEnter Id:";
		cin>>id;
		cout<<"\nEnter Item Name:";
		cin>>itemName;
		cout<<"\nEnter price:";
		cin>>price;
	}
	
		
};
#endif
		
