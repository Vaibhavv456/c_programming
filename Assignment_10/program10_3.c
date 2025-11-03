#include <stdio.h>

int KMtoMeter(int iNo)
{
    int iRate = 1000;
    
    return iNo * iRate;                                     // To convert KM to Meter: KM * 1000
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter distance : ");
    scanf("%d", &iValue);

    iRet = KMtoMeter(iValue);

    printf("Distance in Meter is: %d\n", iRet);
    return 0;
}
