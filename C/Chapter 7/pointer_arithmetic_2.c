#include <stdio.h>
int main()
{
    long long int i = 7;
    long long int *ptr_1 = &i;
    printf("value of prt_1 is %u\n", ptr_1);
    ptr_1++;
    // matlab ptr_1 = prt_1 + 1
    // actually ye hota he ptr_1 = prt_1 + 1*(size of type of pointer in byte)
    // ex. as our pointer is int so ptr_1 = prt_1 + 1*(8)
    printf("value of prt_1 is %u\n", ptr_1);

    ptr_1 = ptr_1 - 2;
    // ex. as our pointer is int so ptr_1 = prt_1 - 2*(8)
    printf("value of prt_1 is %u\n", ptr_1);

    ptr_1 = ptr_1 + 4;
    // ex. as our pointer is int so ptr_1 = prt_1 + 4*(8)
    printf("value of prt_1 is %u\n", ptr_1);
    return 0;
}