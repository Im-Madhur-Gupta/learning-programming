#include <stdio.h>
int main()
{
FILE *in=fopen("pr5.txt","r");
int temp;
fscanf(in,"%d",&temp);
fclose(in);
FILE *out=fopen("pr5.txt","w");
fprintf(out,"%d",2*temp);
fclose(out);

// NOTE - EK HI FILE KO EK TIME PE EK HI MODE SE fopen KIYA JA SAKTA HE
// yaha pe mujhe pr5.txt me se pehle read karna thaa fir write
// to maine pehle r mode se fopen kiya read karke fclose kiya
// phir hi w mode se fopen kiya write karke fclose kar diya
// agr ek hi time pe ek pointer me r aur dusre me w karta to
// ERROR MILTA IZZAT SE KAM KARO

return 0;
}