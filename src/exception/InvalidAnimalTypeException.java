package exception;

// checking validity of animal type
public class InvalidAnimalTypeException extends RescueSystemException {
    public InvalidAnimalTypeException(String message) {
        super(message);
    }
}
