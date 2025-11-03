class Logic
{
    void countFactors(int num)
    {
        int count = 0;
        int originalNum = num;

        if (num <= 0) {
            System.out.println("The number of factors for " + originalNum + " is: 0");
            return;
        }

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                count++;
            }
        }

        System.out.println("The total number of factors for " + originalNum + " is: " + count);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}
