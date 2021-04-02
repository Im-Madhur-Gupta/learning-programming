#include<stdio.h>
int main()
{
    int sum=0,number=1;
    while(number<=10)
    {
        sum += number; //matlab sum = sum + number
        number++;
    }
    printf("%d \n",sum);
    return 0;
}