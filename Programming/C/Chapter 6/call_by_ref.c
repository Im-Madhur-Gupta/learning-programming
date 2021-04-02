#include <stdio.h>
void swap(int *a, int *b);
int main()
{
    int x = 1, y = 2;
    printf("x and y before swap are %d,%d resp.\n", x, y);
    swap(&x, &y); // call by reference
    printf("x and y after swap are %d,%d resp.\n", x, y);
    return 0;
}
void swap(int *a, int *b)
{
    *a = *b + *a;
    *b = *a - *b; // b is swapped
    *a = *a - *b; // a is swapped
    // now original x and y can be tweaked as we have their address
}