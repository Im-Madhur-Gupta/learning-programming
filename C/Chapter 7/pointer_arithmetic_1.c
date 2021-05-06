#include <stdio.h>
int main()
{
int i=7;
int * ptr_1=&i;
printf("value of prt_1 is %u\n",ptr_1);
ptr_1++;
// matlab ptr_1 = prt_1 + 1 
// actually ye hota he ptr_1 = prt_1 + 1*(size of type of pointer in byte)
// ex. as our pointer is int so ptr_1 = prt_1 + 1*(4)
printf("value of prt_1 is %u\n",ptr_1);

short int j=7;
short int * ptr_2=&j;
printf("value of prt_2 is %u\n",ptr_2);
ptr_2++;
// ex. as our pointer is int so ptr_2 = prt_2 + 1*(2)
printf("value of prt_2 is %u\n",ptr_2);

char k='M';
char *ptr_3=&k;
printf("value of prt_3 is %u\n",ptr_3);
ptr_3++;
// ex. as our pointer is int so ptr_3 = prt_3 + 1*(1)
printf("value of prt_2 is %u\n",ptr_3);

return 0;
}