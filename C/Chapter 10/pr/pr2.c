#include <stdio.h>
int main()
{
FILE *ptr=fopen("pr2.txt","w");
for(int i=1;i<11;i++)
{
    fprintf(ptr,"5 X %d = %d\n",i,5*i);
}
fclose(ptr);
return 0;
}