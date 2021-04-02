#include <stdio.h>

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

for(int k=0;k<=1;k++)
{
    for(int l=0;l<=2;l++)
    {
        printf("Marks obtained by student %d in subject %d is %d\n",k+1,l+1,marks[k][l]);
    }
}

return 0;
}