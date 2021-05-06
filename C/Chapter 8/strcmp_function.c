#include <stdio.h>
#include <string.h>

int main()
{
char str1[]="mad";
char str2[]="Mad";

printf("%d",strcmp(str1,str2));
// strcmp --> string compare
// ye function index wise string elements leta he 
// aur left wala ki ascii - right wale ki ascii return kar deta he
// agr dono string same hongi to obviously 0 return karega 
return 0;
}