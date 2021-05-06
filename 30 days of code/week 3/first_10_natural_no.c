#include <stdio.h>

void print_natural_no(int i)
{
    printf("%d\n", i);

    if (i == 10)
    {
        return; // could have used exit(0)
    }

    return print_natural_no(i + 1);
}

int main()
{
    print_natural_no(1);
    return 0;
}