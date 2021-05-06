#include <stdio.h>
int main()
{
    int num;
    long int size = sizeof(int);
    printf("Enter a Number : ");
    scanf("%d", &num);

    int num_of_1s = 0, num_of_0s = 0;

    for (int i = 1; i != 0; i <<= 1)
    {
        if (num & i == i)
        {
            num_of_1s++;
        }
        else
        {
            num_of_0s++;
        }
    }

    printf("Number of '1' bits in the given number is : %d",num_of_1s);
    printf("Number of '0' bits in the given number is : %d",num_of_0s);
    return 0;
}