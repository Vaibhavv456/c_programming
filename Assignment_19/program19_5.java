class Logic
{
    void calculatePower(int base, int exp)
    {
        long result = 1;
        int originalExp = exp;
        int originalBase = base;
        
        if (exp < 0) {
            System.out.println("Calculation for negative exponents is not supported by this integer loop implementation.");
            return;
        }

        if (exp == 0) {
            result = 1;
        } 
        else {
            for (int i = 1; i <= exp; i++)
            {
                result = result * base;
            }
        }

        System.out.println(originalBase + " raised to the power of " + originalExp + " is: " + result);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}
