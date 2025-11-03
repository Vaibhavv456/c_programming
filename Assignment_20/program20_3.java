class Logic
{
    void checkPerfect(int num)
    {
        int sumOfDivisors = 0;
        
        if (num <= 0) {
            System.out.println(num + " is NOT a perfect number.");
            return;
        }

        for (int i = 1; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            {
                sumOfDivisors = sumOfDivisors + i;
            }
        }

        if (sumOfDivisors == num)
        {
            System.out.println(num + " is a Perfect Number.");
        }
        else
        {
            System.out.println(num + " is NOT a perfect number.");
        }
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}
