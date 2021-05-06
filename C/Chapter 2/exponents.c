#include <stdio.h>
#include <math.h> // math.h ka function he pow to iski library include ki
int main()
{
    printf("2 raised to the power 5 is \t %f" ,pow(2,5)); 
    
    /* %f use kiya he naki %d kyoki ye pow function returns a double value 
       for input integer ya decimal dono chalega 
       ( \n ) --> next line 
       ( \t ) --> next tab / ek tab age 
       ^ zor operator he , exponent wala ni */
    
    return 0;
}