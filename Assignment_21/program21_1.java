class Logic
{
    void productOfDigits(int num)
    {
        long product = 1;
        int originalNum = num;
        int tempNum = num;

        if (tempNum < 0) {
            tempNum = -tempNum;
        }

        if (tempNum == 0) {
            product = 0;
        } 
        else {
            while (tempNum != 0)
            {
                int digit = tempNum % 10;
                product = product * digit;
                tempNum = tempNum / 10;
            }
        }

        System.out.println("The product of digits of " + originalNum + " is: " + product);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}
