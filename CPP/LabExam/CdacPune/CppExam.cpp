#include<bits/stdc++.h>

using namespace std;
//Exception handling
class ModelYear : public exception
{
public:
    const char *what() const throw()
    {
        return "Model Year should be Between 1990 and current year";
    }
};
//class Vehicle
class Vehicle{
	private:
		char RegNo[50];
		char name[50];
		int year;
	public:
		Vehicle():year(1990){}
		//Accept data from user
		void Accept(){

			cout<<"Enter model year: ";
                        cin>>year;
			cin.ignore();
			cout<<"Enter name: ";
                        cin.getline(name,50);
			cout<<"Enter RegNo: ";
			cin.getline(RegNo,50);
		}
		//Display function
		void  display() const{
			cout<<"\nVehicle Register Number:-> "<<RegNo<<"\nName:-> "<<name<<"\nYear of Model:-> "<<year;
		}
		//accer
		int getYear(){
			return year;
		}
	
};
//write data to file
void addVehicle()
{
    //create file object
    ofstream fout("vehicle.dat", ios::binary | ios::app);
    //check file exits or not
    if (!fout)
    {
        cout << "Error opening file!" << endl;
        return;
    }
    //create Vehicle class object
    Vehicle v;
    v.Accept();
    //add exception handling 
    if(v.getYear()>=1990 && v.getYear()<=2025){
    	fout.write((char *)&v, sizeof(Vehicle));
    }else{
    	throw ModelYear();
    }
    fout.close();

    cout << "Vehicle added successfully!" << endl;
}
//read file 
void displayAllVehicle()
{
    ifstream fin("vehicle.dat", ios::binary);
    //file exist or not check
    if (!fin)
    {
        cout << "No vehicle found!" << endl;
        return;
    }
    //create class
    Vehicle v;
    while (fin.read((char *)&v, sizeof(Vehicle)))
    {
       
            v.display();
        
    }
    fin.close();
}
// main menu
int main(){
	int n=0;

	int choice;
	//menu driven 
	do{
		cout<<"\n1.Add Vehicle "<<endl;
		cout<<"\n2.Display "<<endl;
		cout<<"\n3.Exit.."<<endl;
		cout<<"\nEnter your choice:->  ";
		cin>>choice;
		switch(choice){
			case 1:{
				cout<<"Enter number of vehicle:->";
       			        cin>>n;

       			        for(int i=0;i<n;i++){
               				 addVehicle();
       			         }
				break;       
			}
			case 2:{
				displayAllVehicle();
				break;       
			}
			case 3:{
				cout<<"Exit...."<<endl;
			 	break;	
			}
			default:{
				cout<<"Entered Invalid choice!";
			}
		}
	}while(choice !=3);
	return 0;
}
