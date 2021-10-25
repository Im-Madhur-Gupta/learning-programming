#include <iostream>
using namespace std;

int power(int a, int b); // --> function prototype
// int power(int, int); --> ye bhi theek he

void greet();

void swap_p(int *p_a, int *p_b) // using pointers
{
    *p_a = *p_a + *p_b;
    *p_b = *p_a - *p_b;
    *p_a = *p_a - *p_b;
}

void swap_r(int &a, int &b) // using reference variables
{
    a = a + b;
    b = a - b;
    a = a - b;
}

int &return_a_ref(int &r) // This function returns a reference variable
{
    r += 2;
    return r;
}

int main()
{
    cout << power(2, 3); // here, 2,3 are called actual parameters, the values actually being passed to the function.
    greet();

    int a = 2, b = 3;
    swap_p(&a, &b); // swap using pointers
    cout << endl
         << a << endl
         << b;

    swap_r(a, b); // swap using reference variables
    cout << endl
         << a << endl
         << b;

    // Returning a reference variable -
    int r = 0;
    return_a_ref(r) *= 3;
    cout << endl
         << r;
    return 0;
}

void greet()
{
    cout << "\nsup.";
}

int power(int a, int b)
{
    // here, a,b are called formal parameters, the placeholders which are local variables to the function and hold the values of the passed agruements.
    int pow = 1;
    for (int i = 1; i <= b; i++)
    {
        pow *= a;
    }
    return pow;
}