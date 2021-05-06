#include <stdio.h>
int main()
{
int i=7;
int *j=&i; // i ka pointer
int **k=&j; // i ke pointer ka pointer

printf("%d",**k);
// value at address operator ko 2 bar use kiya
// do * lagane se hua ye ke -->
// *k  = value of j = add. of i
// **k = value fo i
return 0;
}