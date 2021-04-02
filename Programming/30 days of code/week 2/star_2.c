#include <stdio.h>
int main()
{
    int rows,j;
    scanf("%d", &rows);
    while (rows>=1)
    {
        j=1;
        while (j <= (2*rows-1))
        {
            printf("*");
            j++;
        }
        rows--;
        printf("\n");
    }
    return 0;
}