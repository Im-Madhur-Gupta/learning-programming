#include <stdio.h>
int main()
{
    int num;
    printf("Enter a natural number upto which primes are to be found\n");
    scanf("%d", &num);

    // 1 is not prime
    // 0 is neither prime nor composite

    int l1 = 2, l2, r=1;
    
    printf("Primes found are\n");

    while (l1 <= num)
    {
        l2=2;
        while (l2 < l1)
        {
            if (l1 % l2 == 0)
            {
                r = 0;
                break;
            }
            else
            {
                r=1;
            }
            l2++;
        }

        if (r==1)
        {
            printf("%d  ",l1);
        }

        l1++;
    }
    return 0;
}