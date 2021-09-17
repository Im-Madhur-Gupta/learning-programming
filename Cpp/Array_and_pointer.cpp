#include <iostream>
using namespace std;

int main()
{
    // & --> address of operator.
    // * --> dereferencing operator / value at address operator.

    int a = 7;
    int *b = &a; // ek int variable a ka pointer b.
    cout << a << " " << *b << endl;
    cout << &a << " " << b << endl;

    int **c = &b; // pointer ka pointer

    int arr[4] = {1, 2, 3, 4};
    // IMP - Array ka name aur uske 0th element ka address same cheeze hoti he, yani an array's name is a pointer to it's 0th index element.
    // used pointer arithmetic - (arr + i) is actually {arr + i*(size_of_datatype)} in terms of address. 
    cout << arr[0] << " " << *arr << endl;
    cout << arr[1] << " " << *(arr + 1) << endl;
    cout << arr[2] << " " << *(arr + 2) << endl;
    cout << arr[3] << " " << *(arr + 3) << endl;
    return 0;
}