#include <stdio.h>
int main()
{
FILE *ptr;
ptr=fopen("fgetc.txt","r");
// fgetc ek function he jo character ek file se read karta he
// ek bar me ek character read karta he
// file ke end ko batana ke liye fgetc returns "EOF" End Of File
// as usual reading starts from first line left side

char ch;
while(1)
{
    ch=fgetc(ptr);

    if(ch==EOF)// if(fgetc(ptr)==EOF) will NOT work
    {
        break;
    }

    else
    {
    printf("%c",ch);
    }
}

return 0;
}