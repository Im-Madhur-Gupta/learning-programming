#include <stdio.h>
#include <string.h>
int main()
{
char *name="MADHUR";
printf("%d",strlen(name));
// strlen is standard function from string.h header file
// strlen --> string length , iska output integer hota he
// it counts the number of characters in a string EXCLUDING THE NULL CHARACTER
return 0;
}