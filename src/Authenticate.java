public class Authenticate {
    private final Logger logger;

    public Authenticate(Logger logger) {
        this.logger = logger;
    }

    public void logIn(String login, String password) {
        // login logic

        logger.writeLog("User " + login + " logged in.");
    }
}
