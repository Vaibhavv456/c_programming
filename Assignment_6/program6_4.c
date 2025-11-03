#include <stdio.h>

int Multiply(int iNo1, int iNo2, int iNo3)
{
    int product = 1;
    int countNonZero = 0;

    if(iNo1 != 0)
    {
        product *= iNo1;
        countNonZero++;
    }
    if(iNo2 != 0)
    {
        product *= iNo2;
        countNonZero++;
    }
    if(iNo3 != 0)
    {
        product *= iNo3;
        countNonZero++;
    }

    if(countNonZero == 0) 
    {
        return 0;
    }

    return product;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iValue3 = 0, iRet = 0;

    printf("Please enter three numbers: ");
    scanf("%d %d %d", &iValue1, &iValue2, &iValue3);

    iRet = Multiply(iValue1, iValue2, iValue3);

    printf("Product of numbers: %d\n", iRet);

    return 0;
}