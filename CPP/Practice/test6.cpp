#include <iostream>

using namespace std;
class Box
{
private:
    int height, width;

public:
    Box(int height, int width) : height(height), width(width)
    {
    }
    int area() const
    {
        return height * width;
    }

    bool operator>(const Box &temp)
    {
        return this->area() > temp.area();
    }

    bool operator<(const Box &temp)
    {
        return this->area() < temp.area();
    }
};
int main()
{
    Box b1(10, 20);
    Box b2(10, 20);

    if (b1 < b2)
    {
        cout << "b1 is smaller than b2" << endl;
    }
    else if (b1 > b2)
    {
        cout << "b1 is bigger than b2" << endl;
    }
    else
    {
        cout << "Both are equal" << endl;
    }
}

/*
Implement Box class having height and width. Calculate area of box.
Overload →  > , <
Eg. Box b1(2, 5);    Box b2(3, 5);   if (b1>b2) → here > is overloaded

*/