#include <stdio.h>
unsigned long long int fibonacci(int n);
int main()
{
    int n;
    scanf("%d", &n);
    printf("%llu",fibonacci(n));
    return 0;
}
unsigned long long int fibonacci(int n)
{
    if (n == 1)
        return 0;

    else if (n == 2)
        return 1;

    else
        return fibonacci(n - 1) + fibonacci(n - 2);
}