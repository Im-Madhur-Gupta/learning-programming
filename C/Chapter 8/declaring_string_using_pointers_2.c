#include <stdio.h>
int main()
{
char name[]="JAY";
name="MADHUR";
puts(name);

// Won't work due to 2nd shortcut method
// note - indivisual array elements change to kar hi sakte he
// like name[0]='Z';
// so name now has ZAY
// IS METHOD KA FAYADA YE HE KI ISME STRING KE INDIVISUAL ELEMENTS CHANGE KAR SAKTE HE
// PAR EK SATH PURI STRING CHANGE NI KAR SAKTE
return 0;
}