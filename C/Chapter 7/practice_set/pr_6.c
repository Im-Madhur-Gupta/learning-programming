#include <stdio.h>
int count_pos_int(int arr[], int n)
{
    int count = 0;
    for (int i = 0; i <= (n - 1); i++)
    {
        if (arr[i] > 0)
        {
            count++;
        }
    }
    return count;
}
int main()
{
    int n;
    printf("Enter number of elements to be stored in array ");
    scanf("%d", &n);

    int arr[n];

    for (int i = 0; i <= (n - 1); i++)
    {
        printf("Enter element %d : ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("Number of positive integers stored in array is %d", count_pos_int(arr, n));

    return 0;
}