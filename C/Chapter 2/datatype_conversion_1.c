#include <stdio.h>
int main()
{
    printf("1 + 2 is %d\n" ,1+2); // int aur int ke bech koisa bhi arithmetic op gives int , therefore %d is used
    printf("1.1 + 2 is %f\n" ,1.1+2); // int aur float ke bech koisa bhi arithmetic op gives float , therefore %f is used
    printf("1.1 + 2.5 is %f\n" ,1.1+2.5); // float aur float ke bech koisa bhi arithmetic op gives float , therefore %f is used
    printf("5/2 is %d \n",5/2);
    printf("5.0/2 is %f \n",5.0/2);
    printf("5/2.0 is %f\n",5/2.0);
    printf("2/5 is %d\n",2/5);
    printf("2.0/5 is %f",2.0/5);
    return 0;
}