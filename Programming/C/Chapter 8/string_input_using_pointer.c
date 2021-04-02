#include <stdio.h>
int main()
{
char string[50];    
char *ptr=string;
printf("Enter a string -\n");
fgets(ptr,100,stdin);
puts(ptr);
return 0;
}