public class LeapYear {
    public static void main(String [] args) {
        int year = 2020;
        System.out.println(year);
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("not leap");
        }
    }
}

