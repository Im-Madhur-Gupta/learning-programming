#include <stdio.h>
#include <string.h>
int main()
{
char *source="Tiger Zinda He";
char target[50];

strcpy(target,source);
// strcpy --> string copy 
// strcpy is the equality operator of strings
// equality operator kya karta tha ki right wali value ko uthake left vale container
// me dal deta tha waise hi strcpy function right wali source string ko
// utha ke left wali target/conatiner string me dal deta he
// obviously size of target >= size of source

puts(target);
return 0;
}