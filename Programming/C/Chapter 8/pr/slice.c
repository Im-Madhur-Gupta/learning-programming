#include <stdio.h>
void slice(char *str,int a,int b)
{
    for(int i=0;i<=b-a;i++)
    {
        str[i]=str[a-1+i];
    }
    str[b-a+1]='\0';
    
    fputs(str,stdout);
}
int main()
{
char str[50];
printf("Enter string\n");
fgets(str,50,stdin);

printf("slice starts from : ");
int a,b;
scanf("%d",&a);
printf("slice ends at : ");
scanf("%d",&b);

slice(str,a,b);
return 0;
}