#include <stdio.h>
#include <string.h>

struct citizen{
    char name[50];
    int id;
};
int main()
{
struct citizen bhopal[100];
// bhopal nam ka array bana diya of "struct citizen" type
// jaese int ke alag alag 100 variables banane ki jagah
// maine ek int ka array bana diya tha of 100 elements 
// bs ussi tareke se maine struct citizen ka array bana diya warna mujhe 100 
// alag alag variables banane padte

bhopal[0].id=1;
strcpy(bhopal[0].name,"MADDY");

bhopal[1].id=2;
strcpy(bhopal[1].name,"ADI");

puts(bhopal[1].name);
return 0;
}