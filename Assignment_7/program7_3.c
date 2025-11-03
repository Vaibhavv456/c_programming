#include<stdio.h>

void Display(int iNo)
{
    int i = 0;
    int iStart = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    iStart = -iNo;

    for(i = iStart; i <= iNo; i++)
    {
        printf("%d\t", i);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}
