package exception;

public class InvalidStatusChangeException extends RescueSystemException {
    public InvalidStatusChangeException(String message) {
        super(message);
    }
}
