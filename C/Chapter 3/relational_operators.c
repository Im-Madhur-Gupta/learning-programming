#include <stdio.h>
int main()
{
    int age;
    printf("Enter Your Age \n");
    scanf("%d", &age);

    /* == --> equals , agr barabar he 
    != --> not equal , agr barabar nhi he
     >= ,  > , <= , < are other relational opperators */

    if (age = 0)   // ye statement hamesha false
    {
        printf("hi");
    }
    else if (age = 50)   // ye statement hamesha true
    {
       printf("sleep");

    }
    else
    {
        printf("by");
    }
    

    // jo ye if statement likha he ye wierd he , () ke andar jo condition ani thi uski jagah ek
    // assingment likha he , kyoki c language me agr maine variable ki kuch bhi non zero
    // value daldi to USSE  HAMESHA TRUE MANA JAEGA , bhale hi us variable me kuch bhi value
    // ho ya na ho , AUR AGR US VARIABLE ME 0 dal diya to HAMESHA FALSE

    return 0;
}