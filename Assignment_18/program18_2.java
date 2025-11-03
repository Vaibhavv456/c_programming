class Logic {
    void printEvenNumbers(int n) {
        if (n < 0) {
            n = -n; 
        }

        System.out.println("Even numbers up to " + n + ":");

        
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
