#include<stdio.h>
int main() 
{
    printf("Enter number whose table has to be printed ");
    int n;
    scanf("%d",&n);
    
    for(int m=1;m<=10;m++)
    {
        printf("%d \n",m*n);

    }
    return 0;
}