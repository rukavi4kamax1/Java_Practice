package homework.homework.exception;

public class WrongOrderException extends Exception {//створення власного Exception
    public WrongOrderException(String message) {
        super(message);
    }
}
