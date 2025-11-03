class Logic
{
    void checkEvenOdd(int num)
    {
        if ((num % 2) == 0)
        {
            System.out.println(num + " is Even");
        }
        else
        {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}
