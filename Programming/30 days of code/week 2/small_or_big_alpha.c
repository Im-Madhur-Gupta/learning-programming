#include <stdio.h>
int main()
{
char string [1000];
printf("Enter a string -\n");
fgets(string,1000,stdin);


int k=0,small=0,large=0;
while(string[k] != '\0')
{   
    if(string[k]>=65 && string[k]<=90)
    {
        large++;
    }
    else if(string[k]>=97 && string[k]<=122)
    {
        small++;
    }
    k++;
}

printf("Number of small alphabets occuring in string is %d.\nNumber of large alphabets ocuuring in string is %d.",small,large);

return 0;
}