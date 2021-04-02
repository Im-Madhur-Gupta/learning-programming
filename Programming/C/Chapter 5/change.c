#include <stdio.h>
void change(int b);

int main()
{
    int b = 77;
    printf("%d before \n",b);
    change(b);
    printf("%d after",b);
    return 0;
}

void change(int b)
{
    b = 7;
}