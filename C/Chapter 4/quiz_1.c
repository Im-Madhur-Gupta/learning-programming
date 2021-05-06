#include<stdio.h>
int main()
{
    int a,b=1;
    printf("Enter how many natural numbers are to be printed \n");
    scanf("%d",&a);

    do
    {
        printf("%d \n",b);
        b++;
    } while (b<=a);
    return 0;
}