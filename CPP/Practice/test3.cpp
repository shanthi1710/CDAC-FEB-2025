#include <iostream>
#include <stdexcept>

using namespace std;

class LowBalanceException : public exception
{
public:
    const char *what() const throw()
    {
        return "Withdrawal failed: Minimum balance should be 1000";
    }
};

class PanCardRequiredException : public exception
{
public:
    const char *what() const throw()
    {
        return "Deposit failed: PAN Card required for deposits of 50,000 or more";
    }
};

class Account
{
private:
    int accountNumber;
    string accountHolder;
    double balance;

public:
    Account() : accountNumber(-1), accountHolder(""), balance(0.0) {}

    Account(int accNo, string accHolder, double bal) : accountNumber(accNo), accountHolder(accHolder), balance(bal) {}

    void Accept()
    {
        cout << "Enter Account Number: ";
        cin >> accountNumber;
        cin.ignore();

        cout << "Enter Account Holder Name: ";
        getline(cin, accountHolder);

        cout << "Enter Initial Balance: ";
        cin >> balance;
    }

    void Display() const
    {
        if (accountNumber == -1)
        {
            cout << "No account data available!" << endl;
            return;
        }
        cout << "Account Number: " << accountNumber << ", Name: " << accountHolder << ", Balance: ₹" << balance << endl;
    }

    void Deposit(double amount)
    {
        if (amount >= 50000)
        {
            throw PanCardRequiredException();
        }
        if (amount > 0)
        {
            balance += amount;
            cout << "Deposited: ₹" << amount << ", New Balance: ₹" << balance << endl;
        }
        else
        {
            cout << "Invalid deposit amount!" << endl;
        }
    }

    void Withdraw(double amount)
    {
        if (amount > 0 && (balance - amount) < 1000)
        {
            throw LowBalanceException();
        }
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            cout << "Withdrawn: ₹" << amount << ", Remaining Balance: ₹" << balance << endl;
        }
        else
        {
            cout << "Invalid Withdrawal amount or Insufficient Balance!" << endl;
        }
    }

    int getAccountNumber() const
    {
        return accountNumber;
    }
};

int main()
{
    int n;
    cout << "Enter the number of accounts to create: ";
    cin >> n;

    Account *accounts = new Account[n];

    for (int i = 0; i < n; i++)
    {
        cout << "\nEnter details for Account " << i + 1 << ":\n";
        accounts[i].Accept();
    }

    int choice;
    do
    {
        cout << "\n==== Bank Account Menu ====\n";
        cout << "1. Deposit Money\n";
        cout << "2. Withdraw Money\n";
        cout << "3. Display All Accounts\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
        {
            int accNo;
            double amount;
            cout << "Enter Account Number for Deposit: ";
            cin >> accNo;

            bool found = false;
            for (int i = 0; i < n; i++)
            {
                if (accounts[i].getAccountNumber() == accNo)
                {
                    cout << "Enter Amount to Deposit: ";
                    cin >> amount;
                    try
                    {
                        accounts[i].Deposit(amount);
                    }
                    catch (const PanCardRequiredException &e)
                    {
                        cout << "Exception: " << e.what() << endl;
                    }
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                cout << "Account not found!" << endl;
            }
            break;
        }
        case 2:
        {
            int accNo;
            double amount;
            cout << "Enter Account Number for Withdrawal: ";
            cin >> accNo;

            bool found = false;
            for (int i = 0; i < n; i++)
            {
                if (accounts[i].getAccountNumber() == accNo)
                {
                    cout << "Enter Amount to Withdraw: ";
                    cin >> amount;
                    try
                    {
                        accounts[i].Withdraw(amount);
                    }
                    catch (const LowBalanceException &e)
                    {
                        cout << "Exception: " << e.what() << endl;
                    }
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                cout << "Account not found!" << endl;
            }
            break;
        }
        case 3:
            cout << "\nList of Accounts:\n";
            for (int i = 0; i < n; i++)
            {
                accounts[i].Display();
            }
            break;

        case 4:
            cout << "Exiting Program..." << endl;
            break;

        default:
            cout << "Invalid choice! Please try again.\n";
        }
    } while (choice != 4);

    delete[] accounts;
    return 0;
}
/*
Create class Account with -
DM - acno, name, balance
MF - Constructors, Accept, Display
withdraw, deposit
Handle following exceptions -
Withdraw - lowBalance - if balance < 1000
Deposit    - PanCard Require - if amt >= 50,000
*/