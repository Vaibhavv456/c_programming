class Logic
{
    void reverseNumber(int num)
    {
        int reversedNum = 0;
        int originalNum = num;

        if (num < 0) {
            num = -num;
        }

        while (num != 0)
        {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        System.out.println("The reverse of " + originalNum + " is: " + reversedNum);
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
        obj.reverseNumber(1234); 
    }
}
