#include<stdio.h>
int main()
{
    int skip=5,i=0;
    while(i<5){
        i++;
        if(i!=5){
            continue; 
            /* continue satetment in loops ka matlab he ki ye jo iteration chal rahi he usse chodo
            aur phirse condition check karne pahucho yani compiler ko jaise hi continue statement
            mila to wo uske neeche ka code chod kar phirse condition check karne pahuch jaega */         
        }
        else{
            printf("%d",i);
        }

    }
    return 0;
}