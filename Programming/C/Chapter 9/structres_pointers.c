#include <stdio.h>
#include <string.h>
struct citizen
{
    int code;
    float salary;
    char name[100];
};

int main()
{
    struct citizen c1;
    struct citizen *ptr = &c1;

    (*ptr).code = 1;
    // precendence .  ka * se zyada he 
    // to agr maine likha *ptr.code to ye galat he 
    // ye pehle ptr.code nikalega phir uspe * (value at address operator) use karega 
    printf("%u\n", ptr);
    printf("%d\n", (*ptr).code);
    ptr++;

    (*ptr).salary = 10000000.0;
    printf("%u\n", ptr);
    printf("%f\n", (*ptr).salary);
    ptr++;

    strcpy((*ptr).name, "Madhur");
    printf("%u\n", ptr);
    printf("%s\n", (*ptr).name);

    // simple kya yaad rakh ki agr tune upar jaese pointer banaya
    // to (*ptr) c1 de dega, phir c1 ke sath member operator (.)
    // lagake hum kuch bhi kar sakte he

    // (*ptr).code = 102 ki jagah hum ptr->code bhi likh sakte he
    // "->" is called arrow operator
    // so, (*A).B is equivalent to A->B

    ptr->salary=10000001.0;
    printf("%f\n", ptr->salary);
    return 0;
}