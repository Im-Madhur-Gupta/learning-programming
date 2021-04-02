#include <stdio.h>
int main()
{
    int M,P,C,T;
    
    printf("Please Enter Marks Obtained In Physics \t");
    scanf("%d",&P);

    printf("Please Enter Marks Obtained In Mathematics \t");
    scanf("%d",&M);
    
    printf("Please Enter Marks Obtained In Chemistry \t");
    scanf("%d",&C);
    
    T = P+C+M;

    if(M>=33 && P>=33 && C>=33 && T>=120){
        printf("You have Passed This Sem");
    }

    else {
        printf("You have Failed This Sem");
    }
     return 0;
}