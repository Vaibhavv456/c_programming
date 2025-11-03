#include <stdio.h>

int sum_of_factors(int number)
{
    int iSum = 0;

    if(number < 0)
    {
        number = -number;
    }

    if(number == 0)
    {
        return 0;
    }

    for(int i = 1; i <= number; i++)
    {
        if(number % i == 0)
        {
            iSum += i; 
        }
    }

    // Time Complexity: O(n)
    return iSum;
}

int main(void)
{
    int number;

    printf("Enter number: ");
    scanf("%d", &number);

    printf("%d\n", sum_of_factors(number));

    return 0;
}
