#include <iostream>

using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    // Constructor
    Complex(int r = 0, int i = 0) : real(r), imag(i) {}

    // Post-increment (c1++)
    Complex operator++(int)
    {
        Complex temp = *this; // Store old value
        real++;               // Increment real part
        imag++;               // Increment imaginary part
        return temp;          // Return old value
    }

    // Pre-increment (++c1)
    Complex &operator++()
    {
        real++; // Increment real part
        imag++; // Increment imaginary part
        return *this;
    }

    // Addition with integer (c1 + 5)
    friend Complex operator+(const Complex &c, int val)
    {
        return Complex(c.real + val, c.imag);
    }

    // Addition with integer (5 + c1) (commutative)
    friend Complex operator+(int val, const Complex &c)
    {
        return Complex(val + c.real, c.imag);
    }

    // Overloaded << operator for printing (cout << c5)
    friend ostream &operator<<(ostream &out, const Complex &c)
    {
        out << c.real << " + " << c.imag << "i";
        return out;
    }
};

int main()
{
    Complex c1(10, 20);

    Complex c2 = c1++;   // Post-increment
    Complex c3 = ++c1;   // Pre-increment
    Complex c4 = c1 + 5; // Complex + integer
    Complex c5 = 5 + c1; // Integer + Complex (commutative)

    cout << "c1: " << c1 << endl;
    cout << "c2 (post-increment result): " << c2 << endl;
    cout << "c3 (pre-increment result): " << c3 << endl;
    cout << "c4 (c1 + 5): " << c4 << endl;
    cout << "c5 (5 + c1): " << c5 << endl;

    return 0;
}
/*
Create Complex class and overload the following operators -
Complex c1(10, 20)
Complex c2 = c1++;  ++ is overloaded
Complex c3 = ++c1;  same ++ is overloaded
Complex c4 = c1 + 5;
Complex c5 = 5 + c1;
cout<<c5;   << is overloaded
(solve by using friend functions)
*/