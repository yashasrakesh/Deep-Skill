public class Main {
    public static void main(String[] args) {
        // Try to get multiple instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("This is the first message.");
        logger2.log("This is the second message.");

        // Verify both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances were created.");
        }
    }
}