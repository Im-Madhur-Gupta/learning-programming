#include <stdio.h>
int main()
{
int y = 5;
int *yptr;
yptr = &y;
printf("yptr = %p\n", yptr);
// %p --> prints the address as a hexa decimal number
return 0;
}