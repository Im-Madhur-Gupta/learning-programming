#include <stdio.h>
int main()
{
    FILE *ptr;
    ptr = fopen("madhur.txt", "r");
    // maine ye padha tha ki agr file jo read ho rahi he wo exist ni karti
    // to pointer me NULL store ho jata he 

    if (ptr == NULL)
    {
        printf("File doesn't exist.");
    }

    else
    {
        int num1, num2, num3;
        char c[20];
        fscanf(ptr, "%d %d ", &num1, &num3);
        fscanf(ptr, "%d ", &num2);
        fscanf(ptr, "%[^\n]%*c", &c);
        fclose(ptr);
        printf("%d %d %d ", num1, num3, num2);
        puts(c);
    }
    return 0;
}