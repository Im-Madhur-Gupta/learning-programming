// There are 2 types of header files -

// 1. System defined header files - Ye compiler ke sath ati he.
// Eg -
# include<iostream>

// User defined header files - Ye koi bhi programmer likh sakta he, basically koi set of functions agr app apne program me include karna chahate ho to user defined header files use karte he.
# include "example.h"

// Basic Operators in Cpp are same as those in C.
// int, int ke beech arithmetic op --> int
// int, long int ke beech arithmetic op --> long int
// long int, long int ke beech arithmetic op --> long int
// int, float ke beech arithmetic op --> float
// float, float ke beech arithmetic op --> float

using namespace std;
int main(){
    // bool c = 2<3;
    // cout<<c;
    // Cpp me jab mai boolean variables ko print karunga to 0/1 print hoga, but I can very well use true and false while comparisions.

    int a=2,b=4,c=6;
    cout << (a<=b) && (a<=c);
    // cout << a<=b; --> ye ni chalega, () use karo ie cout<<(a<=b);

    return 0;
}