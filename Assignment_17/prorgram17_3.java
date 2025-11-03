class Logic
{
    void findMax(int a, int b)
    {
        if (a > b)
        {
            System.out.println(a + " is the maximum number.");
        }
        else if (a < b)
        {
            System.out.println(b + " is the maximum number.");
        }
        else
        {
            System.out.println("Both numbers are equal: " + a);
        }
    }
}

class Program
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.findMax(20, 15); 
    }
}
