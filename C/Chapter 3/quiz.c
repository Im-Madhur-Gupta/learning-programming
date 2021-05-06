# include <stdio.h>
int main(){

    int m;
    printf("Enter Marks \n");
    scanf("%d",&m);

    if(m<=100 && m>90){ //if etc me agar sirf ek statement he to bina curly bracket lagaye kam chal sakta he 
        printf("You obtained A grade \n");
    }

    
    else if( m<=90 && m>80){
        printf("You obtained B grade \n");
    }

    
    else if( m<=80 && m>70){
        printf("You obtained C grade \n");
    }

    
    else if( m<=70 && m>60){
        printf("You obtained D grade \n");
    }

    
    else if(m<=60){
        printf("You obtained F grade \n");
    }


    return 0;
}