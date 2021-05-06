#include <stdio.h>
int main()
{
    char str[20];
    printf("Enter a string in capitals -\n");
    fgets(str,20,stdin);

    int n=0;
    for(int i=0;i<=19;i++)
    {
        if(str[i] == '\n' || str[i] == '\0')
        {
            break;
        }
        n++;
    }

    for(int j=0;j<=(n/2);j++)
    {
        if(str[j] != str[n-1-j])
        {
            printf("Not a Palindrome.");
            break;
        }
    }

    printf("\nEntered string is a Palindrome.");

    return 0;
}