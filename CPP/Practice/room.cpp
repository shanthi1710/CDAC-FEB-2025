#include <iostream>
#include <vector>
using namespace std;

class Room
{
protected:
    int room_number;
    string room_type;
    double price_per_day;
    int no_of_days;

public:
    Room(int rno, string rtype, double price, int days)
        : room_number(rno), room_type(rtype), price_per_day(price), no_of_days(days) {}

    virtual double calculate_bill()
    {
        return price_per_day * no_of_days;
    }

    virtual void display_details()
    {
        cout << "Room Number: " << room_number << "\nType: " << room_type
             << "\nPrice per Day: " << price_per_day << "\nNumber of Days: " << no_of_days << "\n";
    }

    virtual void special_feature() = 0;

    virtual ~Room() {}
};

class StandardRoom : public Room
{
    string amenities;

public:
    StandardRoom(int rno, double price, int days, string amen)
        : Room(rno, "Standard", price, days), amenities(amen) {}

    double calculate_bill() override
    {
        return price_per_day * no_of_days;
    }

    void special_feature() override
    {
        cout << "Special Amenities: " << amenities << "\n";
    }
};

class DeluxeRoom : public Room
{
    string special_service;

public:
    DeluxeRoom(int rno, double price, int days, string service)
        : Room(rno, "Deluxe", price, days), special_service(service) {}

    double calculate_bill() override
    {
        return price_per_day * no_of_days * 1.2;
    }

    void special_feature() override
    {
        cout << "Special Services: " << special_service << "\n";
    }
};

int main()
{
    vector<Room *> rooms;
    int choice;
    do
    {
        cout << "\nHotel Management System";
        cout << "\n1. Add Standard Room";
        cout << "\n2. Add Deluxe Room";
        cout << "\n3. Display Room Details and Bill";
        cout << "\n4. Show Special Features";
        cout << "\n5. Exit";
        cout << "\nEnter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
        {
            int rno, days;
            double price;
            string amenities;
            cout << "Enter Room Number: ";
            cin >> rno;
            cout << "Enter Price per Day: ";
            cin >> price;
            cout << "Enter Number of Days: ";
            cin >> days;
            cin.ignore();
            cout << "Enter Amenities: ";
            getline(cin, amenities);
            rooms.push_back(new StandardRoom(rno, price, days, amenities));
            break;
        }
        case 2:
        {
            int rno, days;
            double price;
            string service;
            cout << "Enter Room Number: ";
            cin >> rno;
            cout << "Enter Price per Day: ";
            cin >> price;
            cout << "Enter Number of Days: ";
            cin >> days;
            cin.ignore();
            cout << "Enter Special Services: ";
            getline(cin, service);
            rooms.push_back(new DeluxeRoom(rno, price, days, service));
            break;
        }
        case 3:
            for (auto room : rooms)
            {
                room->display_details();
                cout << "Total Bill: " << room->calculate_bill() << "\n";
                cout << "------------------------\n";
            }
            break;
        case 4:
            for (auto room : rooms)
            {
                room->special_feature();
                cout << "------------------------\n";
            }
            break;
        case 5:
            cout << "Exiting Program.\n";
            break;
        default:
            cout << "Invalid choice, try again!\n";
        }
    } while (choice != 5);

    for (auto room : rooms)
        delete room;

    return 0;
}