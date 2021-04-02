#include <stdio.h>
int main()
{
    float a;
    printf("enter a decimal number ");
    scanf("%f",&a);
    printf("%0.1f with 1 decimal place \n",a);
    printf("%0.2f with 2 decimal places \n",a);
    printf("%0.3f with 3 decimal places \n",a);
     return 0;
}