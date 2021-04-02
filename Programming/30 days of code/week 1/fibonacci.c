#include <stdio.h>
int main()
{
int ft=0,st=1,tt,term=1,num_of_terms;
printf("Enter how many fibonacci numbers are to be printed\n");
scanf("%d",&num_of_terms);
printf("\n%d \n",ft);
printf("%d \n",st);

while(term<=(num_of_terms-2))
{
tt=ft+st;
printf("%d \n",tt);
ft=st;
st=tt;
term++;
}
return 0;
}