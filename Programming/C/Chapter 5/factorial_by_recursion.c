#include <stdio.h>
int factorial(int number);
int main()
{
    int number;
    printf("Enter a number ");
    scanf("%d", &number);
    printf("%d", factorial(number));
    //direct factorial ka output use karo naki koi new variable me store karake
    return 0;
}
int factorial(int number)
{ 
    if (number == 1 || number == 0)
    {
        return 1;
        // recursion me ek BASE condition hoti he which stops any further repeatations
        // here it is if (number == 1 || number == 0) and returning 1
    }
    else
    {
        return number * factorial(number - 1);
        // recursion matlab function ke andar WAHI function ka call
    }
}