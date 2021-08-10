#include <stdio.h>
#include <math.h>
void qroot(float a,float b,float c,float *pointer_of_x1,float *pointer_of_x2){
    printf("%p\n",pointer_of_x1);
    printf("%p\n",pointer_of_x2);
    *pointer_of_x1 = (-1*b + sqrt(b*b-4*a*c))/(2*a);
    *pointer_of_x2 = (-1*b - sqrt(b*b-4*a*c))/(2*a);
}
int main()
{
    printf("Enter coefficients of quadratic equation - \n");
    float a,b,c,x1,x2;
    printf("a = ");
    scanf("%f",&a);
    printf("b = ");
    scanf("%f",&b);
    printf("c = ");
    scanf("%f",&c);
    qroot(a,b,c,&x1,&x2);
    printf("Roots are - %f and %f.",x1,x2);
return 0;
}