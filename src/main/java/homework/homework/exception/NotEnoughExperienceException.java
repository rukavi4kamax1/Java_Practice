package homework.homework.exception;

public class NotEnoughExperienceException extends RuntimeException {//створення власного Exception
    public NotEnoughExperienceException(String message) {
        super(message);
    }
}
