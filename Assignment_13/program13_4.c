#include <stdio.h>

int sum_natural_numbers(int limit)
{
    if(limit <= 0)
        return 0;

    int iSum = 0;
    for(int i = 1; i <= limit; i++)
    {
        iSum += i;
    }

    // Time Complexity: O(n)
    return iSum;
}

int main()
{
    int limit;

    printf("Enter number: ");
    scanf("%d", &limit); 

    printf("%d\n", sum_natural_numbers(limit));
    return 0;
}
