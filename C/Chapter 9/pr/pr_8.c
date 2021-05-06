#include <stdio.h>
typedef struct bank_account{
char name[100];
int acc_no;
char address[100];
char gender;
int age;
}bacc;
int main()
{
bacc c1={"madhur gupta",92854819,"D-27,shalimargadern asdklo",'M',19};
return 0;
}