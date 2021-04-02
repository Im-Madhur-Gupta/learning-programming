#include <stdio.h>
int main()
{
    float income,tax;
    float p;
    printf("Please Enter Your Income \t");
    scanf("%f", &income);
    
    if (income>1000000)
    {
        p=30.00;
        tax=(income*p)/100.00;
        printf("You have to pay %f as income tax" ,tax);
    }

    else if (income>500000 && income<=1000000)
    {
        p=20.00;
        tax=(income*p)/100.00;
        printf("You have to pay %f as income tax" ,tax);
    }

    else if (income>250000 && income<=500000)
    {
        p=50.00;
        tax=(income*p)/100.00;
        printf("You have to pay %f as income tax" ,tax);
    }

    else if (income<=250000)
    {
        p=0.00;
        tax=(income*p)/100.00;
         printf("You have to pay %f as income tax" ,tax);
    }

        return 0;
}