#include <stdio.h>

unsigned long long int fibonacci(int n)
{
    if(n==1)
    {
        return 0;
    }
    else if(n==2)
    {
        return 1;
    }

    return fibonacci(n-1)+fibonacci(n-2);
}

int main()
{

int n;
printf("Enter which fibonacci term has to be printed : ");
scanf("%d",&n);

printf("%d fibonacci term is : %llu\n",n,fibonacci(n));

return 0;
}