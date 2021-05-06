#include <stdio.h>
#include <math.h>
int main()
{
printf("enter the value of side of square \n");
int side,area;
scanf("%d",&side);
area=pow(side,2);
// agr pow function se direct print karate to double value milti yani %lf use karna padta
printf("Area is %d",area); 
return 0;
}