#include <stdio.h>
int main()
{
    int num = 49;
    while (num >= 0)
    {
        printf("%d\n", (2 * num + 1));
        num--;
    }
    return 0;
}