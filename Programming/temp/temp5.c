
#include <stdio.h>
int main()
{
    int num, num_of_0s = 0, num_of_1s = 0;
    long int size = sizeof(int);

    printf("\nEnter a number : ");
    scanf("%d", &num);

    for (int i = 0; i < size * 8; i++)
    {
        /* If LSB is set then increment ones otherwise zeros */
        if (num & 1 == 1)
            num_of_1s++;
        else
            num_of_0s++;

        /* Right shift bits of num to one position */
        num >>= 1;
    }

    printf("Number of '1' bits in the given number is : %d\n", num_of_1s);
    printf("Number of '0' bits in the given number is : %d\n", num_of_0s);

    return 0;
}