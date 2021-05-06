#include <stdio.h>
void printArray(int *p, int n)
// agr mai function ka return type specify ni karta to deafualt yani int pe ho jata
{
    for (int i = 0; i < n; i++)
    {
        printf("Value of element %d of array is %d.\n", i + 1, *(p + i));
        // *(p+i) yaa *p aur next line me p++ ek hi bat he
    }
}
int main()
{
    int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    printArray(A, 10); // ya phir normal wala printArray(&A[0],10);
    return 0;
}

// Array me manlo 5 elements he aur maiane 6th element ka printf de diya
// to error ni ayega par garbage value print hone lagegi