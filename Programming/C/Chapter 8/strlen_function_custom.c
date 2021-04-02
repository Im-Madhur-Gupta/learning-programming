#include <stdio.h>
int string_length(char string[])
{
    char temp=string[0];
    int i=1;
    while (temp != '\0' && temp != '\n')
    {
        temp=string[i];
        i++;
    }
    return i-1;
}
int main()
{
char name[50];
printf("Enter string\n");
fgets(name,50,stdin);
printf("%d",string_length(name));
return 0;
}