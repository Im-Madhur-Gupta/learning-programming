#include<stdio.h>
int main()
{
    int fac=1,number;
    printf("Please Enter a Number ");
    scanf("%d",&number);
    for(int n=1;n<=number;n++)
    {

        fac *= n;
    }
    printf("%d \n",fac);
    return 0;
}