#include <stdio.h>

int main()
{

char name[50]="Hello mam, I'm Mg.";

puts(name);
// puts --> putstring ka short, used to print a string
// Note - puts function end hone ke bad control/cursor ko next line pe bhejdeta he
// fputs asia ni karta

// alt printf me %s use karke bhi kar sakte he
// alt - fputs(name,stdout);

return 0;
}