#include <stdio.h>
int main()
{
    int i = 1;
    do
    {
        printf("%d ", i);
        i++;
        if (i == 3) // break in loop ka matlab - sab chodd ke loop ke bahar aa jao
        {           // valid for all three loops
            break;
        }

    } while (i < 5); 
    return 0;
}