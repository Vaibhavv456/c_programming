// Input :  7
// Output:  2   4   6   8   10  12  14

#include<stdio.h>

void PrintEven(int iNo)
{
    if(iNo <= 0)
    {
        return;
    }

    // Logic
    int iCnt = 1;
    int iEven = 2;

    while(iCnt <= iNo)
    {
        printf("%d\n", iEven);
        iEven = iEven + 2;
        iCnt++;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number\n");

    scanf("%d", &iValue);

    PrintEven(iValue);

    return 0;
}
