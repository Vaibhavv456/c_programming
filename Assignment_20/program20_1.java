class Logic
{
    void sumEvenNumbers(int n)
    {
        int sum = 0;
        int originalN = n;

        if (n < 0) {
            n = -n;
        }
        
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                sum = sum + i;
            }
        }

        System.out.println("The sum of even numbers up to " + originalN + " is: " + sum);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}
