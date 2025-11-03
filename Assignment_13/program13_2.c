#include <stdio.h>

void print_even_numbers(int limit)
{
    if(limit <= 1)
        return;

    for(int i = 2; i <= limit; i += 2)
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

    print_even_numbers(limit);

    return 0;
}
