#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main()
{
int random_no;
srand(time(0));
random_no = rand()%100 + 1;//This code generates a random number between 1 and 100 (both included) , as rand() function gave output of a random int [0,infinite)
printf("%d", random_no);
return 0;
}