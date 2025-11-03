#include <stdio.h>

int EvenFactorial(int iNo)
{
    int i, iFact = 1;

    if(iNo < 0)
        iNo = -iNo;

    for(i = 2; i <= iNo; i += 2)
    {
        iFact *= i;
    }

    return iFact;
}

int main()
{
    int iValue, iRet;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = EvenFactorial(iValue);

    printf("Even Factorial of number is %d\n", iRet);
    return 0;
}
