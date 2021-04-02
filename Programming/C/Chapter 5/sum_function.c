#include <stdio.h>
int sum(int a, int b);
// maine sum name ka function banaya jo a , b as integer input/parameter le raha he
// aur ek integer value as a output de raha he
int main()
{
    int a, b, SUM;
    printf("enter a and b with a space between them \t");
    scanf("%d %d", &a,&b);
    SUM=sum(a,b);
    // sum() ke liye A and B are called arguements,
    // whereas a and b are called parameters.
    printf("a + b is %d",SUM);
    return 0;

// kisi function ke local variable ka name kisi doosre function ke local variable
// se match kar sakta he ex. SUM and SUM in main() , sum()
// kisi function ke andar baene hue local variable ka name us function ke name
// se match ni kar sakta c is case sensitive
// mai sum() ke andar main name ka local variable bana sakta hu
// par is program me agr mai main() ke andar sum name ka local variable banau to thik he
// par kyoki mai main() me hi sum() ko bhi call kar raha hu , 
// to sum vriable aur sum() ki ladai ho jaigi

}
int sum(int a,int b){
    int main=a+b;
    return main;
}