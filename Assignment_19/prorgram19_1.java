class Logic {
    void checkLeapYear(int year) {
        boolean isLeap = false;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.checkLeapYear(2024); 
    }
}
