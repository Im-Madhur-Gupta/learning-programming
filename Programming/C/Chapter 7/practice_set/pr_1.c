#include <stdio.h>
int main()
{

int numbers[10];

for(int i=0;i<=9;i++)
{
    printf("Enter element %d : ",i+1);
    scanf("%d",&numbers[i]);
}

int *ptr=numbers;
ptr = ptr + 2;

if(ptr==&numbers[2]) // pointer ka comparision
printf("True");

else
printf("False");

return 0;
}