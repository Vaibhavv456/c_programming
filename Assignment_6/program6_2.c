#include <stdio.h>
#include <stdbool.h>

bool ChkGreater(int iNo)
{
    if(iNo > 100)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Please enter number: ");
    scanf("%d", &iValue);

    bRet = ChkGreater(iValue);

    if(bRet)
    {
        printf("Greater");
    }
    else
    {
        printf("Smaller");
    }

    return 0;
}
