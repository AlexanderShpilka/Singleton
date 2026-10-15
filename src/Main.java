import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // the same object in memory
        System.out.println(logger == logger2);

        logger.writeLog("Hello");
        logger.writeLog("World");

        Authenticate authenticate = new Authenticate(logger);
        authenticate.logIn("Name", "123456");

        BankAccount bankAccount = new BankAccount(logger2);
        bankAccount.deposit(BigDecimal.valueOf(1000));
    }
}
