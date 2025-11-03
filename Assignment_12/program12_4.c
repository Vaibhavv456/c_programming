#include <stdio.h>

int sum_of_even_factors(int number)
{
    int iSum = 0;

    if(number < 0)
    {
        number = -number;
    }
    
    if(number <= 1) 
    {
        return 0; 
    }
    
    for(int i = 1; i <= number / 2; i++)
    {
        if(number % i == 0 && i % 2 == 0)
        {
            iSum += i;
        }
    }
    
    // Time Complexity: O(n/2) ≈ O(n)
    return iSum;
}

int main()
{
    int number;

    printf("Enter number: ");
    scanf("%d", &number);

    printf("%d\n", sum_of_even_factors(number));

    return 0;
}
