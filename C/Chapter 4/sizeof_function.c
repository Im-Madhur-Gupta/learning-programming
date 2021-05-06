#include<stdio.h>
int main()
{
    short int a,x,y,z;
    int b;
    long int c;
    x=sizeof(a);
    y=sizeof(b);
    z=sizeof(c);
    printf("%d \n",x);
    printf("%d \n",y);
    printf("%d \n",z);

    return 0;
}