#include <stdio.h>
void mul_by_tem(int *y){
    *y *= 10;
}
int main()
{
int x=2;
mul_by_tem(&x);
printf("%d\n",x);
return 0;
}