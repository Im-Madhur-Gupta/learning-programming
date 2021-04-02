#include <stdio.h>
int main()
{
    int i = 1, j = 7;
    int *p_i = &i;
    int *p_j = &j;

    int *subs = p_i - p_j;
    // just like scalar addn or subsn of pointers isn't direct
    // so is pointer to pointer subsn

    printf("p_i is %u\n", p_i);
    printf("p_j is %u\n", p_j);
    printf("subs is %u\n", subs);
    return 0;
}