#include <stdio.h>
unsigned long long int factorial(int n)
{
    if (n == 1)
        return 1;
    else if (n == 0)
        return 1;

    return n * factorial(n - 1);
}

unsigned long long int combinator(int n, int r)
{
    return factorial(n) / (factorial(n - r) * factorial(r));
}

int main()
{
    printf("How many lines are to be printed ");
    int n;
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        for (int s = 1; s <= n - i; s++)
        {
            printf(" ");
        }

        for (int r = 0; r <= i - 1; r++)
        {
            printf("%llu ", combinator(i - 1, r));
        }

        printf("\n");
    }

    return 0;
}
