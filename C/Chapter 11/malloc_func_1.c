#include <stdio.h>
#include <stdlib.h>
int main()
{
// malloc means memory allocation
int *ptr;

ptr = (int *) malloc(6 * sizeof(int));
// basic syntax -
// pointer to which this reserved memory will point = (type casting) malloc(size to be reserved in bytes);

// malloc returns a VOID POINTER so to type cast it to a particular pointer type say int
// we do following - 
// ptr = (int *) malloc( 6 * sizeof(int) );
// matlab ki maine malloc se 6 integers ke liye jagah/memory reserve kara li he

// NOTE - malloc returns a NULL pointer if memory cant be allocated
// we can check it by if(ptr==NULL)

return 0;
}