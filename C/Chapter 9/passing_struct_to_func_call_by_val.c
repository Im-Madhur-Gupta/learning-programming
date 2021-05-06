#include <stdio.h>

struct citizen
{
int code;
float salary;
char name[100];
};

void show(struct citizen c)
{
    printf("%d\n",c.code);
    printf("%f\n",c.salary);
    printf("%s\n",c.name);
    c.code=2;
}

int main()
{
struct citizen c = {1,1,"madhur"};
show(c);
// ye call by value type ka ex he for a custom datatype variable
// so the actual value of variable won't be affected
printf("%d\n",c.code);
return 0;
}