#include <stdio.h>
#include <string.h>
int main()
{
char name[50]="Madhur_";
char *surname="Gupta";
strcat(name,surname);
// strcat --> string concatenate
// ye ek bar me 2 strings ko concatenate karti he yani jod deti he
// it doesn't add any spaces in between the strings
// the final container string i.e the first arguement string (here, name)
// should have enough space to add the other string
// name me RHS se surname jud jaega without spaces
puts(name);
return 0;
}