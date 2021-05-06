#include <stdio.h>

void display(int marks[2][3],int elements,int values)

// agr 2D, 3D ..... array ko func ko pass karna he to ye ni chalega -
// void display(int marks[][],int elements,int values)
// you will have to tell their sizes, it's compulsory now in multi D arrays

// ex. this will work - 
// int temp(int A[2][3][1],int B,int C)

{

for(int i=0;i<=elements-1;i++)
{
    for(int j=0;j<=values-1;j++)
    {
        printf("Marks obtained by student %d in subject %d is %d\n",i+1,j+1,marks[i][j]);
    }
}

}

int main()
{
int marks[2][3];
for(int i=0;i<=1;i++)
{
    for(int j=0;j<=2;j++)
    {
        printf("Enter marks obtained by student %d in subject %d : ",i+1,j+1);
        scanf("%d",&marks[i][j]);
    }
}

display(marks,2,3);
return 0;
}