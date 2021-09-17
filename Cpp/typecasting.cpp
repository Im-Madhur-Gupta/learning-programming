#include <iostream>
using namespace std;

int c = 10;
int main()
{
    int c = 1;
    // cout<<c<<endl; // local c ko use karna he to sirf c likho
    // cout<<::c; // global c ko use karna he to ::c likho, '::' is called scope resolution operator.

    // Cpp me Java kihi tarah decimal literals are by default double datatype.
    // 34.2 --> double he
    // 34.2l, 34.2L --> long double he
    // 34.2f, 34.2F --> float he

    // sizeof() operator is a unary operator jisse mujhe kisi variable/datatype ka bytes me size milta he.
    cout << sizeof(float) << endl;
    cout << sizeof(double) << endl;
    cout << sizeof(long double) << endl;

    // Typecasting Cpp me karne ke 2 ways he -
    // 1. C, Java style -
    cout << sizeof((float)23.4) << endl;
    // 2. Python, Javascript style -
    cout << sizeof(float(23.4)) << endl;
    // IMP - python-style typecasting has higher precedence over C-style typecasting.
    return 0;
}
