#include <stdio.h>

int main()
{
    int a;
    float b;
    char c;
    printf("please enter a character \\ \n"); // " \ " can't be printed in printf
    scanf("%c", &c);
    printf("entered character is %c \n", c); // ek \ print karne ke liye do bar \ likhna padega 

    printf("please enter an integer \n");
    scanf("%d", &a);
    printf("entered integer is %d \n", a);

    printf("please enter a decimal value \n");
    scanf("%f", &b);
    printf("entered decimal value is %f \n", b);

// bina ext ke .c run karne ke liye terminal me gcc ___.c likhte he to exe create ho jati he 
// " -o " se custom name rakh sakte he executable ka , simply -o ke bad exe ka name likhna he 

    return 0;
}