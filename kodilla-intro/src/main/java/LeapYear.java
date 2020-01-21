public class LeapYear {
    public static void main(String[] args) {
         int year = 2011; // type year

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (isLeapYear == true ) {
            System.out.println("Leap Year!");
        } else{
            System.out.println("Not a Leap Year!");
        }
    }
}