#include <stdio.h>
#include <stdlib.h>
int main()
{
int *ptr = (int *) calloc(10,sizeof(int));

for(int i=0;i<10;i++)
{
    ptr[i] = 7 * (i+1);
    printf("7 X %d = %d\n",i+1,ptr[i]);
}

ptr = realloc(ptr,15*sizeof(int));

printf("AFTER REALLOCATION\n");

for(int i=10;i<15;i++)
{
    ptr[i] = 7 * (i+1);
    printf("7 X %d = %d\n",i+1,ptr[i]);
}
return 0;
}