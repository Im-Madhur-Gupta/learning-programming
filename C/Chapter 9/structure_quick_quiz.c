#include <stdio.h>

struct employee{
char name[100];
int id;
float salary;
};

int main()
{
    struct employee e1,e2,e3;

    printf("For employee 1\n");
    printf("name - ");
    scanf("%[^\n]%*c",&e1.name);
    printf("id - ");
    scanf("%d",&e1.id);
    printf("salary - ");
    scanf("%f",&e1.salary);

    printf("For employee 2\n");
    printf("name - ");
    scanf("%*c%[^\n]%*c",&e2.name);
    printf("id - ");
    scanf("%d",&e2.id);
    printf("salary - ");
    scanf("%f",&e2.salary);

    printf("For employee 3\n");
    printf("name - ");
    scanf("%*c%[^\n]%*c",&e3.name);
    printf("id - ");
    scanf("%d",&e3.id);
    printf("salary - ");
    scanf("%f",&e3.salary);
    
    // multiword string lene ka ek aur tareka --> scanf("%[^\n]%*c",e1.name);
    // Here, [] is the scanset character. ^\n tells to take input until newline
    // doesn’t get encountered. Then, with this %*c, it reads newline character
    // and here used * indicates that this newline character is discarded.
    
return 0;
}