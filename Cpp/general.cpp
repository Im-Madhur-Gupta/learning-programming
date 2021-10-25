#include <iostream>
using namespace std;
// agr upar ka ni likhta to har jagah std::cout, std::cin likhna padta.

int c=2;
int main(){
    // int a;
    // cin >> a;
    // cout << a << " Hello Duniya";
    /* Para comment */
    
    // cout apne app se ek newline NI chodd ke jata.

    // Local variable has higher precedence over global variable.
    // int c=3;
    // cout<<"\n"<<c;
    
    // cout<<endl<<c; --> We can use <<endl inplace of <<"\n", yani endl aur "\n" dono newline character dete he.

    // << Insertion operator (cout wala), >> Extraction operator (cin wala).

    // Cpp has only traditional switch and not modern switch.
    
    string str,str2;
    // cin>>str; // Ye tab tak string ke characters ko read karega jabtak usse space (' ') ya newline character ('\n' or enter) na mill jae.
    // cin>>str>>str2; Isse 2 space/newline seperated strings read hongi, basically 2 words read honge.
    // So, for reading strings always use getline() - It can read 1 line at a time.
    getline(cin,str); // Ye tab tak string ke characters ko read karega jabtak usse newline character ('\n' or enter). 
    cout<<str;

    // Note - C++ mai apn printf(), scanf() from stdio.h use kar sakte he for I/O.

    return 0; // successful execution
}