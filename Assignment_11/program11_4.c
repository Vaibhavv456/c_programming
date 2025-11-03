
#include <stdio.h>

int RangeSumEven(int iStart, int iEnd)
{
    int i = 0, iSum = 0;

    // Check for invalid range or non-positive numbers
    if (iStart > iEnd || iStart <= 0 || iEnd <= 0)
    {
        printf("Invalid range\n");
        return -1;
    }

    // Sum of even numbers in the range
    for (i = iStart; i <= iEnd; i++)
    {
        if (i % 2 == 0)
        {
            iSum = iSum + i;
        }
    }

    // Time Complexity: O(n)
    return iSum;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;

    printf("Enter starting point: ");
    scanf("%d", &iValue1);

    printf("Enter ending point: ");
    scanf("%d", &iValue2);

    iRet = RangeSumEven(iValue1, iValue2);

    printf("Addition is %d", iRet);

    return 0;
}

