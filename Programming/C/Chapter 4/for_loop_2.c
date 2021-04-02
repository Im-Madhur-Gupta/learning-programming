#include <stdio.h>
 int main()
 {
    for(int a=1;a<5;++a)  // ++a or a++ dono same kam kar rahe he kyoki for loop execute hota he as
                          // variable initialised -> condition check (true) -> code execute -> increment decrement.
    {    
        printf("%d",a);

    }
      return 0;
 }