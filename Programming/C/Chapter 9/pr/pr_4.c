#include <stdio.h>

typedef struct vector_2D
{
    float x;
    float y;
} vec2;


int main()
{
    vec2 a;
    vec2 *ptr=&a;
    ptr->x=1.1; // equivalent to (*ptr).x=1.1;
    ptr->y=2.0;
    printf("(%f i) + (%f j).",ptr->x,ptr->y);
    return 0;
}