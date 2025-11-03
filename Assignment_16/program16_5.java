class Logic
{
    void countDigits(int num)
    {
        int count = 0;
        int originalNum = num;

        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            count = 1; 
        } else {
            while (num != 0)
            {
                num = num / 10; 
                count++; 
            }
        }

        System.out.println("The number of digits in " + originalNum + " is: " + count);
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
        obj.countDigits(7865);
    }
}
