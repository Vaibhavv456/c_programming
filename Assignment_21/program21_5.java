class Logic
{
    void printDivisibleBy2and3(int n)
    {
        int originalN = n;

        if (n < 0) {
            n = -n;
        }
        
        System.out.println("Numbers divisible by both 2 and 3 (up to " + originalN + "):");

        for (int i = 1; i <= n; i++)
        {
            if ((i % 2 == 0) && (i % 3 == 0))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}
