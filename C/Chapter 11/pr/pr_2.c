#include <stdio.h>
#include <stdlib.h>
int main()
{
int *ptr = (int *) calloc(6,sizeof(int));

for(int i=0;i<6;i++)
{
    printf("Enter number %d : ",i+1);
    scanf("%d",&ptr[i]);
    // alt - scanf("%d",(ptr+i)); using pointer arithmetic
}
return 0;
}