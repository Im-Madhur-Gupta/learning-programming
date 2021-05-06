#include <stdio.h>
int main()
{
    int i = 1, j = 7;
    int *p_i = &i;
    int *p_j = &i;

    if(p_i==p_j)
    printf("same");

    else
    printf("not same/n");
    
return 0;
}