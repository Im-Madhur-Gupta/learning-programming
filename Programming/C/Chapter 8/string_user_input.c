#include <stdio.h>
int main()
{
char name[25];
printf("Enter your name : ");

scanf("%s",&name);
// alt - scanf("%s",&name[0]);
// alt - scanf("%s",name);
// jab user ka input ayega to scanf apne app se last me ek \0 null character dal dega
// scanf can't input multi word strings with spaces
// it will only take initial non spaced string

printf("%s",name);

return 0;
}