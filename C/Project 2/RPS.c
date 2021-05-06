#include <stdio.h>
#include <time.h>
#include <stdlib.h>
void RPS(char compare)
{
    char input;
    printf("Enter R for Rock\tP for Paper\tS for Scissor : ");
    scanf(" %c", &input);

    if (input == 'R' && compare == 'P')
    {
        printf("Computer won");
    }
    else if (input == 'R' && compare == 'S')
    {
        printf("User won");
    }

    else if (input == 'P' && compare == 'R')
    {
        printf("User won");
    }
    else if (input == 'P' && compare == 'S')
    {
        printf("Computer won");
    }

    else if (input == 'S' && compare == 'R')
    {
        printf("Computer won");
    }
    else if (input == 'S' && compare == 'P')
    {
        printf("User won");
    }

    else if (input == compare)
    {
        printf("Tie");
    }
}
int main()
{
    srand(time(0));
    int random_no = rand() % 2;
    char compare, again = 'y';

    if (random_no == 0)
    {
        compare = 'R';
    }

    else if (random_no == 1)
    {
        compare = 'P';
    }

    else if (random_no == 2)
    {
        compare = 'S';
    }

    while (again != 'n')
    {
        RPS(compare);
        printf("\nWould you like to play again ? Enter y for yes and n for no : ");
        scanf(" %c", &again);
        printf("\n");
    }

    return 0;
}

// multiple scanfs me dhyan rakho ki next scanf me ek LEADING SPACE chod do
// multiple scanfs wali problem sirf character, string read karte waqt ayegi