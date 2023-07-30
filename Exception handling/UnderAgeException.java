public class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}
