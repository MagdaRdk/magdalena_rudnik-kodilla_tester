public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println(year);
        if (isLeap(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("not leap");
        }
    }

    private static boolean isLeap(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 == 0)
            return true;
        else return year % 400 != 0;
        /*if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("not leap");
        }*/
    }
}

