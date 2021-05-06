#include <stdio.h>
#include <stdlib.h>
int main()
{
int n;
printf("How many numbers are to be stored : ");
scanf("%d",&n);

float *ptr;
ptr = (float *) malloc(n*sizeof(float));

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

// realloc --> reallocation of the memory
// ussi memory (pointer) me size increase / decrease karana ho to use realloc
// realloc is used when our dynamically allocated memory is insufficient or too large
// syntax - 
// pointer = realloc(pointer, new size);
// NOTE - new size --> new size to be allocated in bytes, syntax for this part is similar to malloc

// ab mai chahta hu ki mai n ki jagah 2n integers store kar wa pau
// to mujhe ptr me memory reallocate karni padegi (aur memory allocate karani padegi)
// similarly we can reduce the allocated memory

ptr = realloc(ptr,2*n*sizeof(float));
// NOTE - realloc ke thorugh size increase karane se pehle se bhare hue blocks ko koi pharak ni padta

for(int i=n;i<2*n;i++)
{
    printf("Enter number %d : ",i+1);
    scanf("%f",&ptr[i]);
}
printf("\n\n");
for(int i=0;i<2*n;i++)
{
    printf("Entered number %d is : %f\n",i+1,ptr[i]);
}
free(ptr);
return 0;
}