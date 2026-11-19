package exception;

// priority factor is missing, or score is outside 0-100
public class InvalidPriorityException extends RescueSystemException {
    public InvalidPriorityException(String message) {
        super(message);
    }
}
