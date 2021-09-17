#include <iostream>
using namespace std;
// agr upar ka ni likhta to har jagah std::cout, std::cin likhna padta.

int c=2;
int main(){
    int a;
    cin >> a;
    cout << a << " Hello Duniya";
    /* Para comment */
    
    // Local variable has higher precedence over global variable.
    int c=3;
    cout<<"\n"<<c;
    
    // cout<<endl<<c; --> We can use <<endl inplace of <<"\n", yani endl aur "\n" dono newline character dete he.

    // << Insertion operator (cout wala), >> Extraction operator (cin wala).

    // Cpp has only traditional switch and not modern switch.
    
    return 0; // successful execution
}