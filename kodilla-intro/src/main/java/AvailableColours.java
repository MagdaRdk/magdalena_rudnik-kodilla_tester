import java.util.Scanner;

public class AvailableColours {

    enum MyColours {
        R, /*red*/
        B, /*blue*/
        P, /*pink*/
        W /*white*/
    }

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first letter of colour");
            String letter = scanner.nextLine().trim();
            MyColours myColours = MyColours.valueOf(letter.toUpperCase());

            switch(myColours) {
            case R:
                System.out.println("Red");
                break;
            case B:
                System.out.println("Blue");
                break;
            case P:
                System.out.println("Pink");
                break;
            case W:
                System.out.println("White");
                break;
            default:
             }

    }
}


