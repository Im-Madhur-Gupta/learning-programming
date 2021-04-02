#include <stdio.h>
typedef struct employee
{
    char name[100];
    int salary;
} emp;
int main()
{
    emp empl1,empl2;

    printf("Enter name on employee 1 : ");
    scanf("%[^\n]%*c",&empl1.name);
    printf("Enter salary of employee 1 : ");
    scanf("%d",&empl1.salary);

    printf("Enter name on employee 2 : ");
    scanf("%*c%[^\n]%*c",&empl2.name);
    printf("Enter salary of employee 2 : ");
    scanf("%d",&empl2.salary);

    FILE *ptr=fopen("pr4.txt","w");
    fprintf(ptr,"%s, %d\n%s, %d",empl1.name,empl1.salary,empl2.name,empl2.salary);

    return 0;
}