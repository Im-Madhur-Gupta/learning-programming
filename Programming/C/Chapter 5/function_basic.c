#include <stdio.h>

void Madhur(); // function prototype yani compiler ko bataya ki function banaya he

int main()
{
Madhur();// function call yani function ko bulaya
return 0;
}

void Madhur(){ // function definition yani function me ho kya raha he
    printf("I created my first function called Madhur.");
}