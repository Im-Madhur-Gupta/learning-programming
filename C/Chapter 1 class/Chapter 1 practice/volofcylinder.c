#include <stdio.h>
int main()
{
    float r;
    printf("Please enter the radius of cylinder \n");
    scanf("%f", &r);
    float h;
    printf("Please enter the height of cylinder \n");
    scanf("%f", &h);
    float v = 3.14 * r * r * h;
    printf("Volume of the cylinder is %f", v);
    return 0;
}