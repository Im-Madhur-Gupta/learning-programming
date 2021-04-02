#include <stdio.h>
float gravityF(float mass);
int main()
{
float mass;
scanf("%f",&mass);
//printf("%d",(int)gravityF(mass)); --> gravityF is typecasted from float to int
printf("%0.2f",gravityF(mass)); // %0.2f ya %.2f same he
return 0;
}
float gravityF(float mass)
{
    return mass*9.8;
}

// note - TYPECASTING
// pow ko typecast karna 
// (int)pow(10,1) --> pow is typecasted from double to int