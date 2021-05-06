#include <stdio.h>

void display(int *marks,int elements,int values)
// parameters are used as local variables to our function
{

for(int i=0;i<=elements-1;i++)
{
    for(int j=0;j<=values-1;j++)
    {
        printf("Marks obtained by student %d in subject %d is %d\n",i+1,j+1,*marks);
        marks++;
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

display(&marks[0][0],2,3);
return 0;
}