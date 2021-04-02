#include <stdio.h>
int main()
{
    float num1,num2,num3,num4;

    printf("Enter FIRST number \n");
    scanf("%f",&num1);
    printf("Enter SECOND number \n");
    scanf("%f",&num2);
    printf("Enter THIRD number \n");
    scanf("%f",&num3);
    printf("Enter FOURTH number \n");
    scanf("%f",&num4);

    if(num1>num2 && num1>num3 && num1>num4){
        printf("FIRST number entered is greatest");
    }

     else if(num2>num1 && num2>num3 && num2>num4){
        printf("SECOND number entered is greatest");
    }

     else if(num3>num2 && num3>num1 && num3>num4){
        printf("THIRD number entered is greatest");
    }

     else if(num4>num2 && num4>num3 && num4>num1){
        printf("FOURTH number entered is greatest");
    }

    else
    {
        printf("Invalid Entries !");
    }
    
     return 0;
}