#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main()
{
int random_no,guess,nguesses=1;
srand(time(0));
random_no = rand()%10 + 1;//This code generates a random number between 1 and 10 (both included) , as rand() function gave output of a random int [0,infinite)
printf("Guess The Number between 1 and 10 \n");
do{
    scanf("%d",&guess);
    if(random_no>guess)
    {
        printf("Larger Number Please. \n");
    }
    else if(random_no=guess)
    {
        printf("You Entered Correct Number in %d attempts.",nguesses);
    }
    else if(random_no<guess)
    {
        printf("Smaller Number Please. \n");
    }
nguesses++;

}while(guess!=random_no);
return 0;
}