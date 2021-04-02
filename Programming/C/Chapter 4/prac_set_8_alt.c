#include<stdio.h>
int main()
{
    int number,fac=1,n=1;
    printf("Please Enter a Number \n");
    scanf("%d",&number);

    while (n<=number)
    {
        fac *= n;
        n++;
    }
    
    printf("%d \n",fac);
    return 0;
}