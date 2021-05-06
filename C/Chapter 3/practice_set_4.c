# include <stdio.h>
int main (){
    printf("Please Enter Year \t");
    int year;
    scanf("%d",&year);

    if ( (( (year%4) == 0 ) && ( (year%100) != 0 )) || (( (year%400) == 0 ) && ( (year%100) == 0 ))) {

        printf("Entered Year is a Leap Year");
    }

    else
    {
        printf("Year is NOT a Leap Year");
    }
    
    return 0;
}