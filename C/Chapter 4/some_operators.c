#include <stdio.h>
int main()
{
    int a=5,b=5,c=5,d=5,e=5;
    a += 10; // matlab a = a + 10 = 15
    printf("%d \n",a);

    b -= 2; // matlab b = b-2 = 3
    printf("%d \n",b);

    c *= 2; // matlab c = c*2 = 10
    printf("%d \n",c);

    d /= 5; // matlab d = d/5 = 1
    printf("%d \n",d);

    e %= 5; // matlab e = e%5 = 0
    printf("%d \n",e);

     return 0;
}