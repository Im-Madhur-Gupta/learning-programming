#include <stdio.h>
int main(){
    printf("How many natural numbers are to be printed in reverse order ");
    int n;
    scanf("%d",&n);

    for(int a=n;a>0;a--){

        printf("%d \n",a);
    }


    return 0;
}