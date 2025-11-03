//Input : 10
//Output: 5     2      1
#include<stdio.h>

void FactRev(int iNo)
{
    int i = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    for(i = iNo / 2; i >= 1; i--)
    {
        if(iNo % i == 0)
        {
            printf("%d\n", i);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number");
    scanf("%d", &iValue);

    FactRev(iValue);

    return 0;
}
