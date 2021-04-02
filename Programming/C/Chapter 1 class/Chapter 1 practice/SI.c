#include <stdio.h>;
int main()
{
     float p;
     float r;
     float t;
     printf("Enter the Principal Amount of Simple Interest \n");
     scanf("%f" ,&p);
     printf("Enter the Rate of Interest of Simple Interest \n");
     scanf("%f" ,&r);
     printf("Enter the Time Period of Simple Interest \n");
     scanf("%f" ,&t);
     printf("Simple Interest will be %f" , p*t*r/100);
     return 0;
}