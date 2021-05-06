#include <stdio.h>

typedef struct complx_no
{
    float r;
    float im;
} complx;

void display(complx a,int i)
{
    printf("\nFor Complex number %d\nReal part is : %f\nImaginary part is : %f\n\n\n",i+1,a.r,a.im);
}
int main()
{
    complx cm_no_set[5];
    for(int i=0;i<5;i++)
    {
        printf("For Complex number %d\nEnter real part : ",i+1);
        scanf("%f",&cm_no_set[i].r);
        printf("Enter imaginary part : ");
        scanf("%f",&cm_no_set[i].im);
        display(cm_no_set[i],i);
    }


    return 0;
}