#include <stdio.h>
int main()
{
    printf("please enter a character \t");
    char alphabet;
    scanf("%c", &alphabet);
    int temp = (int)alphabet;
    
    if(temp>=97 && temp<=122){
        printf("Entered Alphabet is LowerCased");
    }

    else if(temp>=65 && temp<=90){
        printf("Entered Alphabet is UpperCased");
    }
     return 0;
}