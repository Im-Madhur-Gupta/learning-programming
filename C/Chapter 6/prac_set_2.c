#include <stdio.h>
void mad(int I)
{
    printf("address of I is %u\n", &I);
}
int main()
{
    int i;
    printf("address of i is %u\n", &i);
    mad(i);
    return 0;
}

// i aur I ka address alag alag ayega kyoki i ka sirf value copy hui he I me
// i and I are independent variables