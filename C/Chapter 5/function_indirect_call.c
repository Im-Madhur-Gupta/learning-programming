#include <stdio.h>
void f1(),f2();
int main()
{
f1();
return 0;
}
void f1()
{
    printf("f1 is called \n");
    f2(); // zaroori ni he ki hum sare functions ko main me hi call kare 
          // aur kisi function ke through bhi call kar sakte he 
}
void f2()
{
    printf("f2 is called from f1");
}