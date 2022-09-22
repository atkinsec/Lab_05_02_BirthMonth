public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter your birth month 1-12");
        //input birthmonth
        int birthMonth = 10;

        if (birthMonth >= 1 && birthMonth <= 12)
            System.out.println("your birth month is: " + birthMonth);

        else
            System.out.println("error, your birth month is invalid");
    }
}