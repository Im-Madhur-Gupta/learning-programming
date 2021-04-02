#include <stdio.h>
int main()
{
FILE *ptr;
ptr = fopen("jay.txt","w");
// writing mode me ye file ke purane contents hata dega aur jo maine 
// as programmer dale unhe dal dega

fprintf(ptr,"HI there ");
// fprintf yani "file ka printf"
long long int i=170062003;
char str[100]="Hi jay!";
fprintf(ptr,"%lld %s",i,str);
fclose(ptr);
return 0;
}