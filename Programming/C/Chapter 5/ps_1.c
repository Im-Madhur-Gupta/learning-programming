#include <stdio.h>
float avg(float a, float b, float c);
int main()
{
    float a,b,c;
    scanf("%f %f %f",&a,&b,&c);
    printf("%f",avg(a,b,c));
    return 0;
}
float avg(float a, float b, float c)
{
    return (a + b + c) / 3.0;
}