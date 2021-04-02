#include <stdio.h>
int main()
{
     int a=-3.6;
     printf("%d \n" ,a); // it will simply remove the decimal part 3.6 --> 3 , 3.1 --> 3 , -3.6 --> -3

     float b=8;
     printf("%f" ,b); // simply integer ka decimal is added as .000000 

     //abiguous he , depends on compiler
     return 0;
}