#include <stdio.h>

int count_factors(int number)
{
    int iCount = 0;

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
            iCount++;
        }
    }

    // Time Complexity: O(n)
    return iCount;
}

int main()
{
    int number;

    printf("Enter number: ");
    scanf("%d", &number);

    printf("%d\n", count_factors(number));

    return 0;
}
