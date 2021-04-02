#include <stdio.h>
int main()
{
    int i = 7;
    int *j = &i;   // i ka pointer
    int **k = &j;  // j ka pointer yani pointer ka pointer
    int ***l = &k; // k ka pointer yani pointer ke pointer ka pointer
    // this can go on for ever

    printf("value of i is %d \n", i);
    printf("address of i is %u \n", j);

    printf("value of j is %u \n", j);
    printf("address of j is %u \n", k);

    printf("value of k is %u \n", k);
    printf("address of k is %u \n", l);

    return 0;
}