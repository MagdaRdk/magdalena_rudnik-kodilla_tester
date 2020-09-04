package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleSteps implements En {

    private int number;
    private String answer;

    public IsItDivisibleSteps() {
        Given("^number is (.*)$",  (String number) -> {
            this.number = Integer.valueOf(number);
        });
/*TODO
        Given("number is 10", () -> {
            this.number = 10;
        });

        Given("number is 9", () -> {
            this.number = 9;
        });

        Given("number is 7", () -> {
            this.number = 7;
        });
*/
        When("I ask number is divisible", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);

        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });


    }
}
