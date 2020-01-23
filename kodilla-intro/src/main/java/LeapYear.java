public class LeapYear {
  public static void main(String[] args) {
        leapYear(2016);
    }

    public static void leapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println("It's leap year!");
        } else {
            System.out.println("It's not a leap year!");
        }
    }
}
