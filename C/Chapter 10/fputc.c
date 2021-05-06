#include <stdio.h>
int main()
{
FILE * ptr;
ptr = fopen("fputc.txt","w");
char ch;
for(int i=65;i<=90;i++)
{
    ch=i;
    fputc(ch,ptr);
    // fputc ek function he jo characters ko write karta he ek file me
    // ek baar me ek character write karta he 
    // syntax : fputc(kya print karna he,kaha print karna he) 
}
fclose(ptr);
return 0;
}