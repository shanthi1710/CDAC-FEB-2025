#include <iostream>
#include <vector>
using namespace std;

class Laundry
{
protected:
    int Order_ID;
    string Customer_Name;
    int Quantity;

public:
    Laundry(int id, string name, int qty) : Order_ID(id), Customer_Name(name), Quantity(qty) {}

    virtual void display()
    {
        cout << "\nOrder ID: " << Order_ID;
        cout << "\nCustomer Name: " << Customer_Name;
        cout << "\nQuantity: " << Quantity << " clothes";
    }

    virtual double calculate_price() = 0;

    virtual ~Laundry() {}
};

class Regular_Laundry : public Laundry
{
private:
    double iron_Price;

public:
    Regular_Laundry(int id, string name, int qty, double price)
        : Laundry(id, name, qty), iron_Price(price) {}

    void display() override
    {
        Laundry::display();
        cout << "\nLaundry Type: Regular Laundry";
        cout << "\nIron Price per Cloth: Rs." << iron_Price;
    }

    double calculate_price() override
    {
        return Quantity * iron_Price;
    }
};

class Dry_Cleaning : public Laundry
{
private:
    double DryClean_Price;

public:
    Dry_Cleaning(int id, string name, int qty, double price)
        : Laundry(id, name, qty), DryClean_Price(price) {}

    void display() override
    {
        Laundry::display();
        cout << "\nLaundry Type: Dry Cleaning";
        cout << "\nDry Cleaning Price per Cloth: Rs." << DryClean_Price;
    }

    double calculate_price() override
    {
        double total_price = Quantity * DryClean_Price;
        if (Quantity > 10)
        {
            total_price -= (10 * Quantity);
        }
        return total_price;
    }
};

int main()
{
    vector<Laundry *> orders;
    int choice;

    do
    {
        cout << "\n===== Laundry Management System =====";
        cout << "\n1) Add Regular Laundry";
        cout << "\n2) Add Dry Cleaning";
        cout << "\n3) Display Laundry Details";
        cout << "\n4) Calculate Prices";
        cout << "\n5) Exit";
        cout << "\nEnter your choice: ";
        cin >> choice;

        if (choice == 1)
        {
            int id, qty;
            string name;
            double price;
            cout << "\nEnter Order ID: ";
            cin >> id;
            cout << "Enter Customer Name: ";
            cin.ignore();
            getline(cin, name);
            cout << "Enter Quantity: ";
            cin >> qty;
            cout << "Enter Iron Price per Cloth: ";
            cin >> price;

            orders.push_back(new Regular_Laundry(id, name, qty, price));
            cout << "\nRegular Laundry Added Successfully!\n";
        }
        else if (choice == 2)
        {
            int id, qty;
            string name;
            double price;
            cout << "\nEnter Order ID: ";
            cin >> id;
            cout << "Enter Customer Name: ";
            cin.ignore();
            getline(cin, name);
            cout << "Enter Quantity: ";
            cin >> qty;
            cout << "Enter Dry Cleaning Price per Cloth: ";
            cin >> price;

            orders.push_back(new Dry_Cleaning(id, name, qty, price));
            cout << "\nDry Cleaning Order Added Successfully!\n";
        }
        else if (choice == 3)
        {
            if (orders.empty())
            {
                cout << "\nNo Laundry Orders Available!";
            }
            else
            {
                cout << "\n===== Laundry Orders =====";
                for (Laundry *order : orders)
                {
                    order->display();
                    cout << "\n--------------------------";
                }
            }
        }
        else if (choice == 4)
        {
            if (orders.empty())
            {
                cout << "\nNo Laundry Orders Available!";
            }
            else
            {
                cout << "\n===== Price Calculation =====";
                for (Laundry *order : orders)
                {
                    order->display();
                    cout << "\nTotal Price: Rs." << order->calculate_price();
                    cout << "\n--------------------------";
                }
            }
        }
        else if (choice == 5)
        {
            cout << "\nExiting Program...";
        }
        else
        {
            cout << "\nInvalid Choice! Please try again.";
        }
    } while (choice != 5);

    for (Laundry *order : orders)
    {
        delete order;
    }

    return 0;
}