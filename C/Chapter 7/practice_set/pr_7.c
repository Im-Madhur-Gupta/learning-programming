#include <stdio.h>
int main()
{
    int tables[3][10];
    int n;
    for (int i = 0; i <= 2; i++)
    {
        if (i == 0)
        {
            n = 2;
        }
        else if (i == 1)
        {
            n = 7;
        }
        else
        {
            n = 9;
        }

        for(int j=0;j<=9;j++)
        {
            tables[i][j] = n*(j+1);
            printf("%d X %d = %d\n",n,j+1,tables[i][j]);
        }
    }

    return 0;
}