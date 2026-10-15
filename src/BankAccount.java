import java.math.BigDecimal;

public class BankAccount {
    private final Logger logger;

    public BankAccount(Logger logger) {
        this.logger = logger;
    }

    public void deposit(BigDecimal amount) {
        // logic to add amount to the current balance

        logger.writeLog(amount + " added to balance");
    }
}
