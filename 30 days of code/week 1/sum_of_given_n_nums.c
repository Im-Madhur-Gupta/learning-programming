#include <stdio.h>
int main()
{
    double number, sum = 0.0;
    char disp_sum;
    printf("\n** Sum of Numbers **\n\n");
    
    while (1 == 1)
    {
        printf("Enter a number to be added \n");
        scanf("%lf",&number);
        sum += number;
        
        printf("Do you want to see the SUM of numbers and exit the program\nEnter 'y' for yes and 'n' for no\n");
        scanf(" %c",&disp_sum);
        
        if(disp_sum=='y')
        {
            printf("SUM of the numbers is %lf",sum);
            break;
        }

    }
    return 0;
}