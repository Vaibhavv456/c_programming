class Logic
{
    void countEvenOddRange(int n)
    {
        int countEven = 0;
        int countOdd = 0;
        int originalN = n;

        if (n < 0) {
            n = -n;
        }

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }

        System.out.println("For the range 1 to " + originalN + ":");
        System.out.println("Total Even Numbers: " + countEven);
        System.out.println("Total Odd Numbers: " + countOdd);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
