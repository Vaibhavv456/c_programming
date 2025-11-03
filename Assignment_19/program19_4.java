class Logic
{
    void printDigits(int num)
    {
        int originalNum = num;
        
        if (num < 0) {
            num = -num;
        }
        
        if (num == 0) {
            System.out.println(0);
            return;
        }

        System.out.println("Digits of " + originalNum + " are (in reverse order):");

        while (num != 0)
        {
            int digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
