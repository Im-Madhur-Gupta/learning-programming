#include <stdio.h>

typedef struct citizen
{
int code;
float salary;
char name[100];
}mg;

// typedef kya karta he ki wo ek allais name de deta he
// typedef ko apn baki ki cheezo ka allias name banane me bhi use kar sakte he 

void show(mg c)
{
    printf("%d\n",c.code);
    printf("%f\n",c.salary);
    printf("%s\n",c.name);
    c.code=2;
}

int main()
{
mg c = {1,1,"madhur"};
show(c);
// ye call by value type ka ex he for a custom datatype variable
// so the actual value of variable won't be affected
printf("%d\n",c.code);
return 0;
}