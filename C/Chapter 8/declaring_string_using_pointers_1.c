#include <stdio.h>
int main()
{
char *ptr = "Mg";
// ye kya karega ki memory me string variable me Mg store kara dega aur M ka address ptr me store kara dega
// aur kyoki string is an array and for an array we know that address of i=0th element is
// equal to the name of the array 
// hence ptr stores address of i=0th element of string so it can be used as its name

// this is the thrid way of initializing a string 
// 1. simple array wala --> char name[]={'J','A','Y'}
// 2. compiler shortcut wala char --> char name[]="JAY";
// 3. pointers wala --> char *name = "JAY";
// third method is best one B/C USME HUM VALUE STRING KI BAD ME CHANGE KAR SAKTE HE
// BUT 2nd METHOD ME EK BAR INITIALIZE kARNE KE BAD VALUE CHANGE KARNA IS NOT POSSIBLE
// AGR KIYA TO COMPILER ERROR DALEGA 
puts(ptr);
return 0;
}