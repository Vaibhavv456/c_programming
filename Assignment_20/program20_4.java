class Logic
{
    void findLargestDigit(int num)
    {
        int largestDigit = 0;
        int originalNum = num;

        if (num < 0) {
            num = -num;
        }
        
        if (num == 0) {
            largestDigit = 0;
        }

        largestDigit = 0; 

        while (num != 0)
        {
            int digit = num % 10;

            if (digit > largestDigit)
            {
                largestDigit = digit;
            }

            num = num / 10;
        }

        System.out.println("The largest digit in " + originalNum + " is: " + largestDigit);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
