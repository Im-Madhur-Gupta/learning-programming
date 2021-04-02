#include <stdio.h>
int main()
{
// string is a character array ending with '\0' called null character
// \0 indicates that the string has ended

char name[]={'J','A','Y','\0'};

// shortcut to intialize a string
char name[]="JAY";
// ye aur pehle wala code ekdum same output denge
// compiler khud se null character \0 last me laga lega

// char datatype is of 1 byte
// manlo address corresponding to i=0th element (J) is 100
// to A --> 100 + 1 * (size of array type in byte) = 101
// Y --> 102
// \0 --> 103
 
return 0;
}