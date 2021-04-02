#include <stdio.h>
int main()
{
    int x;
    printf("enter x ");
    scanf("%d", &x);
    
    printf("%u \n",&x);
    printf("%d \n",*(&x));
    return 0;
}