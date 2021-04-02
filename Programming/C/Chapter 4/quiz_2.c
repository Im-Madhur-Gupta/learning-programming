#include <stdio.h>
int main()
{
    int a;
    printf("Enter how many natural numbers are to be printed \n");
    scanf("%d",&a);
    printf("\n");

    for(int b=1;b<=a;b++){
        printf("%d \n",b);

    }
    
     return 0;
}