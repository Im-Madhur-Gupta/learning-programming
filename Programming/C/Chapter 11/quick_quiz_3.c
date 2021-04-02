#include <stdio.h>
#include <stdlib.h>
int main()
{
    float *ptr= (float *) malloc(5*sizeof(float));

    for (int i = 0; i < 5; i++)
    {
        printf("Enter number %d : ",i+1);
        scanf("%f",(ptr+i));
    }
    for (int i = 0; i < 5; i++)
    {
        printf("Entered number %d is %f.\n",i+1,*(ptr+i));
    }

    free(ptr); // free function is used to release the allocated memory
    
    return 0;
}