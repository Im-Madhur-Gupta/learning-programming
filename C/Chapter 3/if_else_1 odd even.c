#include <stdio.h>
int main()
{
    printf("Please Enter a Number \n");
    int number;
    scanf("%d", &number);

    if (number % 2 == 0)
    {
        printf("Entered Number is Even \n");
    }

    else
    {
        printf("Entered Number is Odd \n");
    }

    // else part is optional

    return 0;
}