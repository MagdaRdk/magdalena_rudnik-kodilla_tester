package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("^I have deposited (.*) in my wallet$", (String amount) -> {
            wallet.deposit(Integer.parseInt(amount));
            Assert.assertEquals("Incorrect wallet balance", Integer.parseInt(amount), wallet.getBalance());
        });

        When("^I request (.*)$", (String amount) -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, Integer.parseInt(amount));
        });

        Then("^(.*) should be dispensed$", (String amount) -> {
            Assert.assertEquals(Integer.valueOf(amount).intValue(), cashSlot.getContents());
        });

        Then("^the balance of my wallet should be (.*)$", (String amount) -> {
            Assert.assertEquals("Incorrect wallet balance", Integer.valueOf(amount).intValue(), wallet.getBalance());
        });

        Then("Should report error", () -> {
            System.err.println("Cannot withdraw !");
        });

    }
}
