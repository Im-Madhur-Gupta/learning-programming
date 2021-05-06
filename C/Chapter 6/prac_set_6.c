#include <stdio.h>
void mul_by_tem(int y)
{
    y *= 10;
}
int main()
{
    int x = 2;
    printf("x before function call %d\n", x);
    mul_by_tem(x);
    printf("x after function call %d\n", x);
    return 0;
}