#include <stdio.h>
int main()
{
char str[50];
printf("Enter string\n");
fgets(str,50,stdin);

printf("enter the charcter to be checked : ");
char check;
scanf("%c",&check);

int i=0;
while (str[i] != '\0' && str[i] != '\n')
{
    if(check==str[i])
    {
        printf("Character is present.");
        return 0;
    }
    i++;
}
printf("Character is not present.");
return 0;
}