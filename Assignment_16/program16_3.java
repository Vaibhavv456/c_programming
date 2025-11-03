class Logic
{
    void findFactorial(int num)
    {
        long factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        for (int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}
