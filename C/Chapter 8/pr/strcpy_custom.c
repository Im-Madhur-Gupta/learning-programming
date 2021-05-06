#include <stdio.h>
void cpy(char *temp,char *str)
{   
    int i=0;
    while(str[i]!='\0') // string ends at '\0'
    {
        temp[i]=str[i];
        i++;
    }
    temp[i]='\0';
}
int main()
{
char str[50];
printf("Enter string\n");
fgets(str,50,stdin);

char temp[60];
cpy(temp,str);

puts(temp);
return 0;
}