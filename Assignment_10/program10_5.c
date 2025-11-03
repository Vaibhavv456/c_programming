#include <stdio.h>

double FhtoCs(float fTemp)
{
    // Convert Fahrenheit to Celsius using floating-point division
    double dCelsius = (fTemp - 32.0f) * (5.0 / 9.0);
    return dCelsius;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fValue);

    dRet = FhtoCs(fValue);

    printf("Temperature in Celsius is: %.2lf\n", dRet);
    return 0;
}
