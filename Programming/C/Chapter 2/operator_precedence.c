#include <stdio.h>
int main()
{
    // BODMAS isn't applicable in C .
    // priority order works , see notes .
    // value is calculated acc to parenthesis i.e brackets
    float x = 2;
    float y = 3;
    printf("3*x + y/2 is %f \n", 3 * x + y / 2);
    
    printf("3*x / y*2 is %f \n", 3*x / y*2);
    // equal priority ke operators me tie todne ke liye associativity ka use karte he 
    // simply left to right solve karna he 
    // 3*x / y*2 --> 3*2 / 3*2 --> 6 / 3*2 --> 2*2 --> 4

    printf("3*x - 9 / y*2 + 1 is %f", 3*x - 9 / y*2 +1);
    // 3*2 - 9 / 3*2 + 1 --> 6 - 9 / 3 * 2 + 1 -->  6 - 3 * 2 + 1 --> 6 - 6 + 1 --> 0+1 --> 1

    return 0;
}