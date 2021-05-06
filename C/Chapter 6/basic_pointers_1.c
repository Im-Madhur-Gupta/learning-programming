#include <stdio.h>
int main()
{
int i=8;

int *j; // or int *j=&i; 
j=&i;

printf("value of i is %d \n",i);
printf("value of i is %d \n",*j); 
// value at address operator (*) is used
printf("value of i is %d \n",*(&i));
// value at address (*) and address of (&) operators are used

printf("address of i is %u \n",&i);
// kisi bhi variable ka address print karana he to %u format specifier use karo
printf("address of i is %u \n",j);
// pointer type variable ki value print karane ke liye %u format specifier use karo

printf("address of j is %u \n",&j);

printf("value of j is %u \n",*(&j));
return 0;
}