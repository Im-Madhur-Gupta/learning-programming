#include <iostream>
using namespace std;

// Fuction Overloading - an example of Polymorphism
// Function ka name ek lekin uske kai sare forms, function overloading is achieved by changing the argument list, return type sirf change karne se func overloading ni ho sakti.
int sum(int a, int b)
{
    return a + b;
}
// long long int sum(int a, int b) isn't an overloaded func. as only the return type is changed.
// {
//     return a + b;
// }
int sum(int a, int b, int c)
{
    return a + b + c;
}
float sum(float a, float b)
{
    return a + b;
}
int main()
{
    
    return 0;
}