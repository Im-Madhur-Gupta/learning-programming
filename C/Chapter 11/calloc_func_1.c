#include <stdio.h>
#include <stdlib.h>
int main()
{
int *ptr;

ptr = (int *) calloc(6,sizeof(int));
// calloc --> contiguos allocation
// quite similar to malloc
// syntax -
// pointer = (typecasting) calloc (kitne blocks reserve karane he,ek block ka size kitna ho);
// IMP - it initializes every block to 0
// Similary as malloc, if memory allocation fails then it returns a NULL pointer
// if (ptr==NULL)

return 0;
}