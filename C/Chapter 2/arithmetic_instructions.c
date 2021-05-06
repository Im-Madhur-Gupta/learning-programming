#include <stdio.h>
int main()
{
    int a=2 , b=3;
    int c;

    /* a*b=c; ye galat he kyoki = operator ek assingment operator he 
    matlab wo left wali cheez me wo right wali value store kar deta he 
    yaha par left ki value is 6 (fixed) can't be altered , therefore code galat tha  */
    
    c=a*b; // ye ek dum sahi 
    printf("%d \n",c);

// Modulus operator , remainder dene wala
    
    printf("when 7 is divided by 2 it leaves the remainder %d \n" ,7%2);
    
    // % operator can't be used on float,double values i.e decimal values , it can only be used on integers

    // remainder ka sign follows that of the numerator , it's a rule

    printf("when -7 is divided by 2 it leaves the remainder %d \n" ,-7%2);

    printf("when 7 is divided by -2 it leaves the remainder %d" ,7%-2);
     return 0;
}