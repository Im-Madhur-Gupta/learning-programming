#include <stdio.h>
int main()
{
    int rows, i = 1,j;
    scanf("%d", &rows);
    while (i <= rows)
    {
        j=1;
        while (j <= i)
        {
            printf("*");
            j++;
        }
        i++;
        printf("\n");
    }
    return 0;
}