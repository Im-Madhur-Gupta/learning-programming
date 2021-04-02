#include <stdio.h>
int main()
{
    float r;
    printf("Please enter the radius of circle \n");
    scanf("%f", &r);
    float ar = 3.14 * r * r;
    printf("Area of the circle is %f", ar);
    return 0;
}