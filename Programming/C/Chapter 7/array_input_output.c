#include <stdio.h>
int main()
{
    int marks[5];
    int i = 1,j=1;

    while (i <= 5)
    {
        printf("Enter marks of student %d ", i);
        scanf("%d", &marks[i - 1]);
        i++;
    }

    while(j<=5){
        printf("Entered marks of student %d is %d\n",j,marks[j-1]);
        j++;

    }
    return 0;
}