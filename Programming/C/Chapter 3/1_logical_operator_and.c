# include <stdio.h>

int main() {
    int age;
    printf("Please Enter Your Age ");
    scanf("%d" ,&age);

    if (age >= 18 && age <= 70) // and operator ke liye ' && ' .
    {
        printf("You Can Drive");
    }
    
    else
    {
        printf("You can't Drive");
    }
    


    return 0;
}