#include <stdio.h>
#include <stdlib.h>
int main()
{
int *ptr = (int *) calloc(5,sizeof(int));

ptr = realloc(ptr,10*sizeof(int));
return 0;
}