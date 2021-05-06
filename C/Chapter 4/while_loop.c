#include <stdio.h>
int main()
{

    int a;
    scanf("%d", &a);

    while (a < 10)
    {
        a = a + 1; // is line ki jagah a++; bhi likh sakte the
        printf("%d ", a);
    }

    return 0;
}