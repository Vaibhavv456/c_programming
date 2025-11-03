class Logic {
    void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is NOT a prime number.");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is NOT a prime number.");
                return;
            }
        }

        System.out.println(num + " is a prime number.");
    }

    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.checkPrime(11); 
    }
}
