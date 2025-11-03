class Logic
{
    void calculateSum(int n)
    {
        int sum = 0;
        int i = 1;

        if (n < 0) {
            n = -n;
        }

        while (i <= n)
        {
            sum = sum + i;
            i++;
        }

        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        // Time Complexity: O(n)
    }

    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
