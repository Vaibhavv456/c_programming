class Logic
{
    void displayFactors(int num)
    {
        int originalNum = num;

        if (num < 0) {
            num = -num;
        }
        
        System.out.println("Factors of " + originalNum + " are:");

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
