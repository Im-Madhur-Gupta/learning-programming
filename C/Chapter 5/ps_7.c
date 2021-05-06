#include <stdio.h>
void star(int n);
int main()
{
    star(6);
    return 0;
}
void star(int n)
{
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=(2*i-1);j++)
        {
            printf("*");
        }
        printf("\n");
    }
}