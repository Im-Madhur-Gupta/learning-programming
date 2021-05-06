#include <stdio.h>
void printArray(int A[], int n)

// agr mai function ka return type specify ni karta to deafualt yani int pe ho jata

// agr mai yaha aisa likhta void printArray(int A[10], int n)
// yani specify karta ki array me kitne elements he to bhi chalta
// yani specify karna is optional in 1D array

{
    for (int i = 0; i < n; i++)
    {
        printf("Value of element %d of array is %d.\n", i + 1, A[i]);
    }
    A[9]=10;// array ke elements ki indexing 0 se start hogi
}
int main()
{
    int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    printArray(A, 10);
    printf("%d\n",A[9]);
    return 0;
}
// function ko array pass karne me call by value and reference wala difference khatam ho jata he
// b/c agr apne pura array diya to address of 0th element = "name of array"
// aur agr array ke 0th element ka address diya to * operator (value at addres)
// se hum actual array ke elemnts change kar sakte he
// so basically dono me call by value and ref for array to func we can change value of 
// actual elements of array 