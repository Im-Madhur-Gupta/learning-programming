#include <stdio.h>
#include <stdlib.h>
int main()
{

printf("\nPlease enter the symbol according to which arithmetic operation has to be performed\n\nFor Addition press +\nFor Substraction press -\nFor Multiplication press *\nFor Division press /\nFor Remainder press %%\n\n");
char sym;
scanf("%c",&sym);

double n1,n2,result;
printf("Enter First Number ");
scanf("%lf",&n1);

printf("Enter Second Number ");
scanf("%lf",&n2);

if(sym=='+')
result=n1+n2;

else if(sym=='-')
result=n1-n2;

else if(sym=='*')
result=n1*n2;

else if(sym=='/')
result=n1/n2;

else if(sym=='%')
result = ( (int)n1 % (int)n2 ); 

else
{
    printf("Invalid symbol entered");
    exit(0);
}


// modulus operator only works on integer input
// (type_name) expression --> typecasting ka syntax 

printf("\nResult of arithmetic operation is %lf.\n",result);

exit(0);
return 0;
}