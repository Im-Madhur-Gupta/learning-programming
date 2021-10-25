#include <iostream>
#include <sstream>
using namespace std;
int main()
{
    stringstream ss("23,4,56");
    char ch;
    int a, b, c;
    ss >> a >> ch >> b >> ch >> c; // a = 23, b = 4, c = 56
    cout << a << endl
         << b << endl
         << c;
    // ss pe >> agr value return kar pa raha he to conditional me as true liya jaega.
    return 0;
}