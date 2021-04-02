#include <stdio.h>
int main()
{
char name[]="JAY";

// ab mai is string ko print kar waunga 
// while loop is recommended for this purpose

char *ptr=name; // alt - char *ptr=&name[0]

while(*ptr != '\0') // jese hi null character aae to we can stop printing
{
    printf("%c",*ptr);
    ptr++;
}

// \0 yani null character ka sole kam yahi he ki wo string ka end batatae

return 0;
}