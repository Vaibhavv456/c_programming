class Logic {
    void findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println(a + " is the minimum number.");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is the minimum number.");
        } else {
            System.out.println(c + " is the minimum number.");
        }
    }

    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}
