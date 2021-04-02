#include <stdio.h>
#include <string.h>
// structure ko define kara

struct citizen{ // is custom datatype ka name he "struct citizen"
int age;
unsigned long long int adhaar;
char gender;
char name[100]; //  ye string array type se defined he
float income;
}; // semicolon ayega

int main()
{
// structures are custom data types
// structures can hold dissimilar values

// declaring and initializing a variable "c1" of the custom datatype "struct citizen"
struct citizen c1;
c1.age = 19;
c1.adhaar = 123412341234;
c1.gender = 'M';
c1.income = 0.0;
// c1.name="Madhur Gupta";  ye galat he kyoki maine string array type se define ki hai 
// hath se mai element wise change kar sakta hu is string ko, so i will use strcpy
strcpy(c1.name,"Madhur Gupta");

// "." --> Member operator
// c1.age --> c1 variable ka age parameter/value

printf("%d ",c1.age);
puts(c1.name);

return 0;
}