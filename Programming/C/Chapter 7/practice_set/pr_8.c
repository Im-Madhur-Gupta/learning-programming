#include <stdio.h>
int main()
{
    int n, m;
    printf("How many number of tables are to be printed : ");
    scanf("%d", &n);
    printf("How many multiples are to be printed : ");
    scanf("%d", &m);

    int tables[n][m];
    int nums_table[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter number %d whose table has to be printd :\n", i + 1);
        scanf("%d", &nums_table[i]);
    }

    for (int j = 0; j < n; j++)
    {   
        printf("Following is the table of %d - \n",nums_table[j]);
        for (int k = 0; k < m; k++)
        {
            tables[j][k] = nums_table[j] * (k + 1);
            printf("%d X %d = %d\n",nums_table[j],k+1,tables[j][k]);

        }
        printf("**************************************************************\n\n");
    }

    return 0;
}