#include <stdio.h>
int main()
{
    int row;
    printf("Enter the number of rows to be printed : ");
    scanf("%d", &row);

    int pattern[row][row];

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            if (j == 0 || j == i)
            {
                pattern[i][j] = 1;
            }
            else
            {
                pattern[i][j] = pattern[i - 1][j] + pattern[i - 1][j - 1];
            }
            printf("%d ", pattern[i][j]);
        }
        printf("\n");
    }

    return 0;
}