class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        int originalNum = num;

        if (num < 0) {
            num = -num;
        }

        while (num != 0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("The sum of digits of " + originalNum + " is: " + sum);
    }


    public static void main(String[] args)
    {
        Program.main(args); 
    }
}

class Program
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
