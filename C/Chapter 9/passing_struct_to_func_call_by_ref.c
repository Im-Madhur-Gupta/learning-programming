#include <stdio.h>

struct citizen
{
int code;
float salary;
char name[100];
};

void show(struct citizen *ptr)
{
    printf("%d\n",ptr->code);
    printf("%f\n",ptr->salary);
    printf("%s\n",ptr->name);
    ptr->code=2;
}

int main()
{
struct citizen c = {1,1,"madhur"};
show(&c);
// ye call by reference type ka ex he for a custom datatype variable
// so the actual value of variable will be affected
printf("%d\n",c.code);
return 0;
}