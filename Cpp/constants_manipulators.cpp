#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    // Constants in Cpp - just use the "const" key word before declaration.
    int a=3;
    const int b=2;
    a=6;
    // b=8; --> not allowed as b is a constant.


    // Manipulators in Cpp - Data ko format karne me help karte he
    // Ex -
    // 1. endl - for \n newline, from iostream header file.
    // 2. setw() - from iomanip header file.
    int x=1,y=11,z=111;
    cout<<x<<endl;
    cout<<y<<endl;
    cout<<z<<endl;
    cout<<setw(3)<<x<<endl;
    cout<<setw(3)<<y<<endl;
    cout<<setw(3)<<z<<endl;
    // setw(3) likhne par setw() make sure karega ki uske agge jo print ho raha he wo atleast 3 character length ka ho, yani wo number ko right justify karke print karega.
    cout<<setw(4)<<"*"<<endl; 
    cout<<setw(4)<<"**"<<endl; 
    cout<<setw(4)<<"***"<<endl; 
    cout<<setw(4)<<"****"<<endl; 
    cout<<setw(4)<<"*****"<<endl; // ab kyoki ye aur 4 star wala pehle se hi 5, 4 characters ke he to no leading space is req.

    return 0;
}