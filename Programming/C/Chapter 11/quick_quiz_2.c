#include <stdio.h>
#include <stdlib.h>
int main()
{
int n;
printf("How many numbers are to be stored : ");
scanf("%d",&n);

float *ptr;
ptr = (float *) calloc(n,sizeof(float));

// RULE - ARRAY KA NAME AUR USKE 0th ELEMENT KA ADDRESS INTERCHANGEABLY
//        USE KIYA JA SAKTA HE.

for(int i=0;i<n;i++)
{
    printf("Enter number %d : ",i+1);
    scanf("%f",&ptr[i]);
}
printf("\n\n");
for(int i=0;i<n;i++)
{
    printf("Entered number %d is : %f\n",i+1,ptr[i]);
}

return 0;
}