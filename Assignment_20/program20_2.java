class Logic
{
    void printReverse(int n)
    {
        int originalN = n;
        
        if (n < 0) {
            n = -n;
        }
        
        System.out.println("Numbers from " + n + " down to 1:");

        for (int i = n; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}
