class Logic
{
    void findSmallestDigit(int num)
    {
        int smallestDigit = 9;
        int originalNum = num;

        if (num < 0) {
            num = -num;
        }
        
        if (num == 0) {
            smallestDigit = 0;
        }

        while (num != 0)
        {
            int digit = num % 10;

            if (digit < smallestDigit)
            {
                smallestDigit = digit;
            }

            num = num / 10;
        }

        System.out.println("The smallest digit in " + originalNum + " is: " + smallestDigit);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}
