#include <stdio.h>
float temp_conv(float C);
int main()
{
    float C;
    scanf("%f",&C);
    printf("%0.2f",temp_conv(C));
    return 0;
}
float temp_conv(float C)
{
    return 32.0 + 1.8 * C;
}