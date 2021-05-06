#include <stdio.h>
int main()
{
    float c;
    printf("Enter the Celcius value \n");
    scanf("%f" ,&c); // Taking input of centigrade value

    float f = 32 + 1.8 * c; // calculating farenheit value
    printf("The Farenheit value is %f" , f); // printing farenheit value

    return 0;
}