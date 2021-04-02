#include <stdio.h>
int main()
{
int a=1,b=7;
int *ptr_a=&a,*ptr_b=&b;

printf("Before swap %d , %d\n",a,b);

*ptr_a=*ptr_a+*ptr_b;
*ptr_b=*ptr_a-*ptr_b;
*ptr_a=*ptr_a-*ptr_b;

printf("Before swap %d , %d\n",a,b);

return 0;
}