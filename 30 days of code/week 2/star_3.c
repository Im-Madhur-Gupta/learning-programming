#include <stdio.h>
#include <stdlib.h>
int main()
{
    int N, i = 1, spaces = 1, stars = 1;
    scanf("%d", &N);
    while (i <= N)
    {
        spaces = 1, stars = 1;
        while (spaces <= (N - i))
        {
            printf(" ");
            spaces++;
        }
        while (stars <= i)
        {
            printf("* ");
            stars++;
        }
        i++;
        printf("\n");
    }
    exit(0); // to exit the program.
    return 0;
    
}