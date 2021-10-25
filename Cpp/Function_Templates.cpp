#include <iostream>
using namespace std;

// Creating a Function Template -
template<class T1,class T2>
// T1, T2 need not be primitive datatypes. They can be classes as well.
float avg(T1 x,T2 y){
    return (x+y)/2.0f;
}

int main()
{
    cout<<avg(5,2)<<endl;
    cout<<avg(5,2.0)<<endl;
    cout<<avg(5.0,2.0);
    return 0;
}