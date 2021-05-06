#include <stdio.h>
int main()
{
int arr_1[5]={1,2,3,4,5};
int arr_2[5];

int *ptr=arr_1;

for(int i=0;i<5;i++)
{
    arr_2[i] = *(ptr+i);
}

for(int j=0;j<5;j++)
{
    printf("%d ",arr_2[j]);
}
return 0;
}