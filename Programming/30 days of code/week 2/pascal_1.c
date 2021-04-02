#include <stdio.h>
int main()
{
printf("How many lines are to be printed ");
int n;
scanf("%d",&n);

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        printf("%d",j);
    }
    for(int s=1;s<=2*(n-i);s++)
    {
        printf(" ");
    }
    for(int k=i;k;k--)
    {
        printf("%d",k);
    }
    printf("\n");
}
return 0;
}