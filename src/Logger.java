import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Logger {
    private static Logger instance;
    private static final String FILE_NAME = "log.txt";

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public synchronized void writeLog(String message) {
        String messageWithLineSeparator = message + System.lineSeparator();

        try {
            Files.writeString(
                    Path.of(FILE_NAME),
                    messageWithLineSeparator,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

        } catch (IOException ex) {
            throw new FileProcessingException("Error writing to file: " + FILE_NAME, ex);
        }
    }
}
