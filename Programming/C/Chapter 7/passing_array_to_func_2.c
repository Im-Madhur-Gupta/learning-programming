#include <stdio.h>
void printArray(int A[], int n)
// agr mai function ka return type specify ni karta to deafualt yani int pe ho jata
{
    for (int i = 0; i < n; i++)
    {
        printf("Value of element %d of array is %d.\n", i + 1, A[i]);
    }
}
int main()
{
    int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    printArray(A, 10);
    return 0;
}