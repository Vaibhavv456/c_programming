class Logic {
    void sumEvenOddDigits(int num) {
        int sumEven = 0;
        int sumOdd = 0;
        int originalNum = num;

        if (num < 0) {
            num = -num;
        }

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }

            num /= 10;
        }

        System.out.println("For number " + originalNum + ":");
        System.out.println("Sum of Even Digits: " + sumEven);
        System.out.println("Sum of Odd Digits: " + sumOdd);
    }

    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
