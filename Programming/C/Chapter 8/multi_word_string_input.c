#include <stdio.h>
int main()
{
    char str[20];
    scanf("%[^\n]%*c", str);
    // [] is the scanset character. ^\n tells to take input until newline doesn’t get encountered
    // Then, with this %*c, it reads newline character and here used * indicates that this newline
    // character is discarded.
    return 0;
}