#include <stdio.h>

void print_odd_numbers(int limit)
{
    if(limit <= 0)
        return;

    for(int i = 1; i <= limit; i += 2)
    {
        printf("%d\t", i);
    }

    // Time Complexity: O(n/2) ≈ O(n)
}

int main()
{
    int limit;

    printf("Enter number: ");
    if(scanf("%d", &limit) != 1)
    {
        printf("Invalid input\n");
        return 1;
    }

    print_odd_numbers(limit);

    return 0;
}
