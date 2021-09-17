#include <iostream>
using namespace std;

int main()
{
    // Reference variable - (This isn't a pointer) (Kisi variable ka ALIAS name banana)
    // When a variable is declared as a reference, it becomes an alternative name ie ALIAS for an existing variable. A variable can be declared as a reference by putting ‘&’ in the declaration. 
    // Variable ek hi he bas uske alag alag name de diye gaye he jinse usse pukara jaa raha he.
    // Because references are not objects, there are no arrays of references, no pointers to references, and no references to references:
    // int& a[3]; // error
    // int&* p;   // error
    // int& &r;   // error

    int x=3;
    int& y=x;
    cout<<x<<endl<<y;
    return 0;
}