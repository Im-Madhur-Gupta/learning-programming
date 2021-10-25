#include <iostream>
using namespace std;

// Static variables matlab wo variables jo function ki 1st call me initialize hote he and then successive calls me jo purani value pe prev. call end hui thi wohi chalti he. Matlab they are local variables of a function but they DON'T get destroyed once the function call ends.

// inline functions -
// inline func. me compiler compile time me function body ko function call se replace kar deta he, isse wo wala time bachta he jo actual parameters ko formal parameters me copy karne me lagta he AUR return karne me jo time lagta he wo bhi bachta he.
// Kisi function ko inline banane ke liye mai compiler se REQUEST karta hu, compiler ke upar he ki wo inline karta he ke ni depending whether func ko inline banana sahi he ke ni.
// Be cautious while declaring a function inline, sirf unko inline karo jinka code chota he aur jo kum baar call kiye jaa rahe he, actually inline declare karne se DRY voilate ho raha he, memory bhi zyada lag jaegi successive calls of inline function me. Recursive func ko, wo func jinme static variables, loops, conditionals use ho rahe ho unhe as inline func declare ni karna.
inline int mult(int x, int y)
{
    return x * y;
}

// Default Arguments -
// Mai kisi bhi function ke arguements ko ek default value de sakta hu, to agr function call me ek argument ki value pass ni ki to default value chal jaegi.
// IMP - All the default arguments should on the RIGHT in the argument list of the function.
float moneyReq(int amount, float factor = 1.05)
{
    return amount * factor;
}

// Constant Arguments -
// Mai kisi function ke agruments ko constant kar sakta hu, matlab ek baar func call se value aa ke store ho gai to fir wo constant ho jae.
int srtlen(const char *p)
{
    // now pointer p is a const can't be changed.
}

int main()
{
    // int a, b;
    // cin >> a >> b; // this input will work for space seperated AND \n seperated ints.
    // cout << a << " " << b << endl;

    // cout << mult(a, b);

    cout << moneyReq(1000) << endl
         << moneyReq(1000, 1.1);
    return 0;
}