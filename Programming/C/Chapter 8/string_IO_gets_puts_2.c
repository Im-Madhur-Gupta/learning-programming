#include <stdio.h>

int main()
{

char name[50]="Hello mam, I'm Mg.";

// gets(name);
// gets function purana ho gaya he, isme buffer overflow ho jata he 
// yani ye bina yaad rakhe ke kitne chars ka input lena he (array max)
// ye bas input lena start kar deta he bina buffer ki max length specify kare
// to overflow ho jata he
// other words it can be said that it is not safe to use gets because it doesn't check the array bound.
// so instead of gets we use fgets function

fgets(name,50,stdin);
// fgets ke arguements
// 1st arguement --> pointer to string (0th element) / name of string
// 2nd arguement --> max length of string including \0 yani total length of string array
// 3rd arguement --> stream file that identifies input eg. stdin
// VERY IMPORTANT REGARDING FGETS -
// fgets kya karta he hamari puri string leta he phir mai enter dalta hu to '\n'
// aur store kar leta he and finally '\0' store karta he to mark string end. 
// It keep on reading until new line character (\n)
// encountered or maximum limit of character array.

fputs(name,stdout);

return 0;
}