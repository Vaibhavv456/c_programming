class Logic
{
    void checkPalindrome(int num)
    {
        int reversedNum = 0;
        int originalNum = num;
        int tempNum = num;

        if (tempNum < 0) {
            tempNum = -tempNum;
        }

        while (tempNum != 0)
        {
            int digit = tempNum % 10;
            reversedNum = reversedNum * 10 + digit;
            tempNum = tempNum / 10;
        }

        if (originalNum == reversedNum)
        {
            System.out.println(originalNum + " is a Palindrome");
        }
        else
        {
            System.out.println(originalNum + " is NOT a Palindrome");
        }
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
        obj.checkPalindrome(121); 
    }
}
