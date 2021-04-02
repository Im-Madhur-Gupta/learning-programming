#include <stdio.h>
int main()
{
int a=1;
printf("%d %d %d",a,++a,a++);

// gcc compiler printf (any function) ke arguements RIGHT to LEFT leta he ek ek karke
// yani compiler sabse pehle a++ pe jaega
// a++ --> print kar dega 1 aur a=2 kar dega
// phir ++a --> a=2+1=3 kardega aur 3 print kar dega
// phir a --> ab a=3 he to 3 print ho jaega
// this behaviour of taking arguements from a function from Right to Left depends on compiler
// so ask which compiler

return 0;
}