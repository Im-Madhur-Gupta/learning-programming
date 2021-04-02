#include <stdio.h>
int main()
{
FILE * ptr=fopen("pr1.txt","r");
int arr[3];

for(int i=0;i<3;i++)
{
    fscanf(ptr,"%d",&arr[i]);
    printf("%d ",arr[i]);
}

return 0;
}