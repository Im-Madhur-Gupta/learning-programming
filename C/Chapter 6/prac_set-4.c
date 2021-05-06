#include <stdio.h>
void sum_and_avg(int *sum_p, float *avg_p,int a,int b){
    *sum_p = a+b;
    *avg_p = *sum_p / 2.0;
}
int main()
{
int a=3,b=4,sum;
float avg;
sum_and_avg(&sum,&avg,a,b);
printf("%d %d %d %0.2f ",a,b,sum,avg);
return 0;
}