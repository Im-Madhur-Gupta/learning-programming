#include <stdio.h>
int main()
{   
    int n,m;
    printf("Enter the number whose table has to be printed ");
    scanf("%d",&n);
    printf("Enter how many multiples have to be printed ");
    scanf("%d",&m);


int table[m];

for(int i=0;i<=(m-1);i++)
{
    table[i] = n*(i+1);
    printf("%d X %d = %d\n",n,(i+1),table[i]);
}

return 0;
}