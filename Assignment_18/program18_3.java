class Logic {
    void printOddNumbers(int n) {
        if (n < 0) {
            n = -n; 
        }

        System.out.println("Odd numbers up to " + n + ":");

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}
