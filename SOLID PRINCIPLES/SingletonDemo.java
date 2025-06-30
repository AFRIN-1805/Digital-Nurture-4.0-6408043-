class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Hello, Afrin!");

        Logger logger2 = Logger.getInstance();
        logger2.log("Same instance being used!");

        System.out.println(logger1 == logger2); // true
    }
}
