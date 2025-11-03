#include <stdio.h>

int sum_even_numbers(int limit)
{
    if(limit <= 0)
        return 0;

    int iSum = 0;

    for(int i = 1; i <= limit; i++)
    {
        iSum += 2 * i;
    }

    // Time Complexity: O(n)
    return iSum;
}

int main(void)
{
    int limit;

    printf("Enter number: ");
    scanf("%d", &limit);

    printf("%d\n", sum_even_numbers(limit));
    return 0;
}
