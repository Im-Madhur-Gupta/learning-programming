#include <stdio.h>
int main()
{
FILE *in=fopen("pr3_in.txt","r"),*out=fopen("pr3_out.txt","w");
char c=fgetc(in);
while(c != EOF)
{
    fprintf(out,"%c%c ",c,c);
    c=fgetc(in);
}
return 0;
}