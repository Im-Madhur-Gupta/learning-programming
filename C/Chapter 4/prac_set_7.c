#include<stdio.h>
int main()
{
    int sum=0;
    for(int n=1;n<=10;n++)
    {
        sum += (8*n);
    }
    printf("%d \n",sum);
    return 0;
}