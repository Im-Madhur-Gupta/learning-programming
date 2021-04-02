#include <stdio.h>

typedef struct vector_2D
{
    float x;
    float y;
} vec2;

vec2 vectorsum(vec2 a, vec2 b)
{
    vec2 c={a.x+b.x , a.y+b.y};
    return c;
}

int main()
{
    vec2 a = {1.1, 0.0}, b = {2.5, 6.8};
    vec2 c = vectorsum(a,b);
    printf("sum vector is (%0.2f i) + (%0.2f j).",c.x,c.y);
    return 0;
}