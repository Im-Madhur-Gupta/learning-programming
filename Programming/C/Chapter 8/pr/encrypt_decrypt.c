#include <stdio.h>

void encrypt(char *ptr)
{
    while (*ptr != '\0' && *ptr != '\n')
    {
        *ptr = *ptr + 1;
        ptr++;
    }
    // yaha maine baisc pointers ki madad se kam kiya
}

void decrypt(char *ptr)
{
    while (*ptr != '\0' && *ptr != '\n')
    {
        *ptr = *ptr - 1;
        ptr++;
    }
    // yaha maine baisc pointers ki madad se kam kiya
}

int main()
{
    char str[50];
    printf("Enter string\n");
    fgets(str, 50, stdin);

    encrypt(str);
    printf("encrypted string is\n");
    puts(str);

    decrypt(str);
    printf("decrypted string is\n");
    puts(str);

    return 0;
}