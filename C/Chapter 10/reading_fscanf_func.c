#include <stdio.h>
int main()
{
FILE *ptr;
ptr=fopen("madhur.txt","r");
int num1,num2,num3;
char c[20];

// fscanf yani "file ke liye scanf"
// syntax - fscanf(file ka pointer,"format specifier",address of storage variables);

fscanf(ptr,"%d %d ",&num1,&num3);
fscanf(ptr,"%d ",&num2);
fscanf(ptr,"%[^\n]%*c",&c);

fclose(ptr);
// fclose yani "file ko close karo" , syntax fclose(pointer to file);

printf("%d %d %d ",num1,num3,num2);
puts(c);

return 0;
}