class Logic {
    void printTable(int num) {
        int limit = 10;
        int originalNum = num;

        if (num < 0) {
            num = -num; 
        }
        
        System.out.println("Multiplication Table for " + originalNum + ":");

        for (int i = 1; i <= limit; i++) {
            int result = num * i;
            System.out.println(originalNum + " * " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.printTable(5); 
    }
}
