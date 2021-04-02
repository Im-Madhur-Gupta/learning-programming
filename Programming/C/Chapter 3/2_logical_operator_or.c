#include <stdio.h>

int main()
{
    char drunk;
    printf("Are you Drunk , yes = y , no = n \t");
    scanf("%c", &drunk);

    char vippass;
    printf("Do you have a VIP pass , yes = y , no = n \t");
    scanf(" %c", &vippass); // is line me jo %c ke pehle ek space mara he wo imp he 

    int age;
    printf("Please Enter Your Age \t ");
    scanf("%d", &age);

    if ((age >= 18 && age <= 70) || vippass == 'y' && !(drunk=='y')) // and operator ke liye ' && ' , or operator ke liye ' || '.
    {
        printf("You Can Drive");
    }

    else // operator precedence of logical operators is in notes.
    {
        printf("You can't Drive");
    }

    return 0;
}