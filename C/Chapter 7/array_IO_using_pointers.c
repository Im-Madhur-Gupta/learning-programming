#include <stdio.h>
int main()
{
    int marks[4];
    int *p = &marks[0]; // another way of writing this line is int *p = marks;

    for(int i=0;i<4;i++)
    // taking input using pointer p
    // as we do p++ pointer jumps from 0th element of array to 1st element of array
    {
        printf("Enter marks obtained by student %d : ",i+1);
        scanf("%d",p);
        p++;
    }

    p = &marks[0];

    for(int j=0;j<4;j++)
    // giving output using pointers
    {   
        printf("Marks obtained by student %d is %d.\n",j+1,*p);
        p++;

    }

    return 0;
}