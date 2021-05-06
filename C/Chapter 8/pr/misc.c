#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch;
    char s[100];
    char sen[100];
    
    scanf("%c\n",&ch); // alt - scanf("%c ",&ch);
    // upar wale scanf me \n dala to scanf newline character ko bhi read karlega
    // aur wo buffer se bahar chala jaega
    scanf("%[^\n]%*c",s);
    scanf("%[^\n]%*c",sen);
    
    printf("%c\n",ch);
    puts(s);
    puts(sen);
    
    return 0;
}