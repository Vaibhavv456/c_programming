#include <stdio.h>

void print_numbers(int limit)
{
    if(limit < 0)
    {
        limit = -limit; 
    }
    
    for(int i = 1; i <= limit; i++)
    {
        printf("%d\t", i);
    }

    // Time Complexity: O(n)
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

    print_numbers(limit);

    return 0;
}
