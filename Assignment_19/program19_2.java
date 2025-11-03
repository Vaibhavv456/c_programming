class Logic
{
    void displayGrade(int marks)
    {
        String grade;

        if (marks >= 75)
        {
            grade = "A Grade";
        }
        else if (marks >= 60)
        {
            grade = "B Grade";
        }
        else if (marks >= 35)
        {
            grade = "C Grade";
        }
        else
        {
            grade = "Fail";
        }

        System.out.println("For marks " + marks + ", the grade is: " + grade);
    }

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}
