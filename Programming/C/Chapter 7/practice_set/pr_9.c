#include <stdio.h>
int main()
{
int threeD_arr[2][3][4];
int *ptr=threeD_arr;

for(int i=0;i<24;i++)
{
    printf("Addresses of the elements of 3D array are\n");
    printf("%u\n",ptr);
    ptr++;
}
return 0;
}