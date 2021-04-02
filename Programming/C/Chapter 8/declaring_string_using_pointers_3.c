#include <stdio.h>
int main()
{
char *name="JAY";
name="MADHUR";
puts(name);

// Will work due to 3rd pointer method
// YE READ ONLY MEMORY HOTI HE
// INDIVIUAL ELEMENTS OF STRING (ARRAY) AGR CHANGE KARNE HE TO YE NI CHALEGA
// PAR PURI STRING EK HI BAR ME CHANGE HO SAKTI HE
return 0;
}