#include <stdio.h>
struct citizen
{
int code;
float salary;
char name[100];
};
int main()
{

// another way to initialize structure variable
struct citizen c1={1,1500000.0,"Madhur Gupta"};
// note the inputs are given sequentially as per the order of the 
// parameters made in structure "citizen"
// struct citizen variable name ={int,float,"string"};

printf("%d\n",c1.code);
printf("%f\n",c1.salary);
printf("%s\n",c1.name);

struct citizen c2={0};// isse wo sare parameters 0 set ho jaenge jo ho sakte he
// ex. int float , but string,char ni hopaega
printf("%d\n",c2.code);
printf("%f\n",c2.salary);
printf("%s\n",c2.name);

return 0;
}