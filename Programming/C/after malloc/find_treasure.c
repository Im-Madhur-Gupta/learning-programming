#include <stdio.h>
#include <stdlib.h>
void print(int largest)
{
    int smallest = 1;
    while ((smallest != largest) && (smallest != (largest - 1)))
    {
        printf("%d %d ", smallest++, largest--);
    }

    if ((smallest == largest))
    {
        printf("%d\n", smallest);
    }
    else if(smallest == (largest - 1))
    {
        printf("%d %d ", smallest, largest);
    }
}
int main()
{
    int num_cases;
    scanf("%d", &num_cases);
    int length[num_cases], len, *arr;
    for (int i = 0; i < num_cases; i++)
    {
        scanf("%d", &len);
        length[i] = len;
        arr = (int *)malloc(len * sizeof(int));
        for (int i = 0; i < len; i++)
        {
            scanf("%d", arr + i);
        }
    }

    for (int j = 0; j < num_cases; j++)
    {
        print(length[j]);
    }

    return 0;
}