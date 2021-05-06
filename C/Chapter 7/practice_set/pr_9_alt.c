#include <stdio.h>
int main()
{
int threeD_arr[2][3][4];
int *ptr=threeD_arr;

for(int i=0;i<2;i++)
{
    for(int j=0;j<3;j++)
    {
        for(int k=0;k<4;k++)
        {
            printf("Address of [%d][%d][%d] is %u\n",i,j,k,(ptr+i+j+k));
        }
        printf("\n");
    }
    printf("\n\n");
}
return 0;
}