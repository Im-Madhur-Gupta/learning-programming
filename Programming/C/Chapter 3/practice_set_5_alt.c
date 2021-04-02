#include <stdio.h>
int main()
{
    printf("please enter a character \t");
    char alphabet;
    scanf("%c", &alphabet);
    
    if(alphabet>=97 && alphabet<=122){
        printf("Entered Alphabet is LowerCased");
    }

    else if(alphabet>=65 && alphabet<=90){
        printf("Entered Alphabet is UpperCased");
    }
     return 0;
}