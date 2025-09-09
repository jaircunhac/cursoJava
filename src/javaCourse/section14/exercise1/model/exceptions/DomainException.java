package javaCourse.section14.exercise1.model.exceptions;

// extends Exception = Needs to be treated in the code
// extends RuntimeException = Don't need to be treated
public class DomainException extends Exception{
    public DomainException(String message) {
        super(message);
    }
}
