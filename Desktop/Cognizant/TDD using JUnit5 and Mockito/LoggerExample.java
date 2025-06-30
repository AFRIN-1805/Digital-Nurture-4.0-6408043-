import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public void doSomethingRisky(boolean fail) {
        logger.info("Method started");
        if (fail) {
            logger.warn("About to fail!");
            logger.error("Something went wrong!");
        } else {
            logger.debug("Everything is fine.");
        }
    }

    public static void main(String[] args) {
        LoggerExample le = new LoggerExample();
        le.doSomethingRisky(true);  // trigger logs
        le.doSomethingRisky(false); // trigger debug
    }
}
