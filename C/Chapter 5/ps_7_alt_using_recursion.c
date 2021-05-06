#include <stdio.h>
void star(int n);
int main()
{
    star(6);
    return 0;
}
void star(int n)
{
   if(n==1)
   {
       printf("*\n");
   }
   else
   {
       star(n-1);
       for(int i=1;i<=(2*n-1);i++)
       {
           printf("*");
       }
       printf("\n");
   }
   
}