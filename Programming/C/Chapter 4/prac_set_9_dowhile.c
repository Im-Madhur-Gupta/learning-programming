#include <stdio.h>
int main()
{
    long number;
    // 1 is not prime because prime number ke two distinct factor hone chahiye ie 1 and itself
    // 1 ke case me ye distinction nahi he isliye not a prime

    int r = 0, n = 2; // by default to r me 0 hi stored hoga

    printf("Enter a Number ");
    scanf("%ld", &number); // long ke liye %ld

    do
    {
        if (number == 1)
        {
            r = 1;
            break;
        }
        else if (number == 0)
        {
            r = 2;
            break;
        }

        else if (number == 2)
        {
            r = 0;
            break;
        }
        else if (number % n == 0)
        {
            r = 1;
            break;
        }
        n++;
    } while (n < number);

    if (r == 1)
    {
        printf("NOT A PRIME \n");
    }
    else if (r == 0)
    {
        printf("PRIME \n");
    }
    else if (r == 2)
    {
        printf("Neither PRIME nor COMPOSITE \n");
    }
    return 0;
}