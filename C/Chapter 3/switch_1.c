#include <stdio.h>
int main()
{
    int rating;
    printf("Please Enter Your Rating (1-5) \n");
    scanf("%d", &rating);

    switch (rating) // switch me mai integer aur char variables dono use kar sakta hu 
                    // kyoki char ko asani se type cast kiya ja sakta he to integer
    {

    case 1:
    printf("You Rated 1 \n");
    break;

    case 2:
    printf("You Rated 2 \n");
    break;

    case 3:
    printf("You Rated 3 \n");
    break;

    case 4:
    printf("You Rated 4 \n");
    break;

    case 5:
    printf("You Rated 5 \n");
    break;

    default :
    printf("Invalid \n");
    break;
    } // break yani switch ko chodo bahar aa jao.  

    return 0;
}