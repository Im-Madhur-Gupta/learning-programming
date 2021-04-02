#include <stdio.h>

void Good_Morning(),Good_Afternoon(),Good_Night();

int main()
{
Good_Morning();
Good_Afternoon(); 
Good_Night();
return 0;
}

void Good_Morning(){
    printf("Good Morning \n");
}

void Good_Afternoon(){
    printf("Good Afternoon \n");
}

void Good_Night(){
    printf("Good Night \n");
}