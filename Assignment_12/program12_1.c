#include <stdio.h>

void print_factors(int number)
{
    if(number < 0)                      // handle negative input
    {
        number = -number;
    }


    for(int i = 1; i <= number; i++)    // Print all factors from 1 to number
    {
        if(number % i == 0)
        {
            printf("%d\t", i);
        }
    }
    printf("\n"); 
    // Time Complexity: O(n)
}

int main()
{
    int number;

    printf("Enter number: ");
    scanf("%d", &number);

    print_factors(number);

    return 0;
}
