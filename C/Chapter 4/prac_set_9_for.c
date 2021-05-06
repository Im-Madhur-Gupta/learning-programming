#include <stdio.h>
int main()
{
    long number;
    // 1 is not prime because prime number ke two distinct factor hone chahiye ie 1 and itself
    // 1 ke case me ye distinction nahi he isliye not a prime

    int r = 0; // by default to r me 0 hi stored hoga
    printf("Enter a Number ");
    scanf("%ld", &number); // long ke liye %ld

    if (number == 1)
    {
        r = 1;
    }

    for (long n = 2; n < number; n++)
    {
        if (number % n == 0)
        {
            r = 1;
            break;
        }
    }

    if (r == 1)
    {
        printf("NOT A PRIME \n");
    }
    else if (r == 0)
    {
        printf("PRIME \n");
    }
    return 0;
}