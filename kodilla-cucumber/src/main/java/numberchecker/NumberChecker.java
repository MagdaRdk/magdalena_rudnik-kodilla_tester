package numberchecker;

public class NumberChecker {

    public String checkIfDivisible(int dividend) {
        if (dividend % 15 ==0) {
            return "FizzBuzz";
        } else if (dividend % 5 ==0) {
            return "Buzz";
            } else if (dividend % 3 ==0) {
            return "Fizz";
        }
        else return "None";

    }
}
