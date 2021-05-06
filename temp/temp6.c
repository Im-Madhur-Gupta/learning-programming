#include <stdio.h>
int main()
{
    int row;
    printf("Enter the number of rows to be printed : ");
    scanf("%d", &row);

    int col=row;
    int pattern[row][col];

    pattern[0][0] = 1;
    pattern[1][0] = 1;
    pattern[1][1] = 1;

    for (int i = 2; i < row; i++)
    {
        for (int j = 0;; j++)
        {
            if (j == 0)
            {
                pattern[i][j] = 1;
                continue;
            }
            else if(j==i)
            {
                pattern[i][j] = 1;
                break;
            }

            pattern[i][j] = pattern[i - 1][j] + pattern[i - 1][j - 1];
        }
    }

    printf("Pattern obtained is as follows -\n\n");
    for(int k=0;k<row;k++)
    {
        for(int m=0;m<=k;m++)
        {
            printf("%d ",pattern[k][m]);
        }
        printf("\n");
    }
    printf("\n");
    return 0;
}