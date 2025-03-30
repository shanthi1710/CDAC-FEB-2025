#include <iostream>

using namespace std;

class BaseMath
{
public:
    virtual void CalArea()
    {
        cout << "BaseMath::CalArea() - Default Implementation" << endl;
    }
};

class Math1 : virtual public BaseMath
{
public:
    int Add(int a, int b)
    {
        return a + b;
    }
    int Sub(int a, int b)
    {
        return a - b;
    }

    void CalArea() override
    {
        cout << "Math1::CalArea() - Calculating Area in Math1" << endl;
    }
};

class Math2 : virtual public BaseMath
{
public:
    int Mul(int a, int b)
    {
        return a * b;
    }
    int Div(int a, int b)
    {
        if (b == 0)
        {
            cout << "Error: Division by zero!" << endl;
            return 0;
        }
        return a / b;
    }

    void CalArea() override
    {
        cout << "Math2::CalArea() - Calculating Area in Math2" << endl;
    }
};

class Calculator : public Math1, public Math2
{
public:
    void CalArea() override
    {
        cout << "Calculator::CalArea() - Resolving Diamond Problem" << endl;
    }
};

int main()
{
    Calculator calc;

    cout << "Addition: " << calc.Add(5, 3) << endl;
    cout << "Subtraction: " << calc.Sub(10, 4) << endl;
    cout << "Multiplication: " << calc.Mul(6, 2) << endl;
    cout << "Division: " << calc.Div(12, 4) << endl;

    calc.CalArea();

    return 0;
}
/*
Implement 2 classes - Math1                               - Add(int, int), Sub(int, int)                     - CalArea()
Math2 - Mul(int, int), Div(int, int) - CalArea()
Now class Calculator  (inherits both Math1 and Math2)
And call CalArea() in Calculator  (diamond problem) - solve the probem
*/