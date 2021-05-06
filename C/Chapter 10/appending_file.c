#include <stdio.h>
int main()
{
FILE *ptr;
ptr = fopen("adi.txt","a");
// append mode me ye file ke purane contents rahenge aur jo maine 
// as programmer dale unhe iske last me dal diya jaega

fprintf(ptr,"HI there ");
// fprintf yani "file ka printf"
long long int i=170062003;
char str[100]="Hi jay!";
fprintf(ptr,"%lld %s",i,str);
fclose(ptr);

return 0;
}