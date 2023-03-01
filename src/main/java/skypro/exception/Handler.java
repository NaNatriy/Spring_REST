package skypro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import skypro.exception.EmployeeException;
import skypro.exception.MessageForExceptions;
@ControllerAdvice
public class Handler {
    @ExceptionHandler
    public ResponseEntity<MessageForExceptions> handleException(
            EmployeeException personException) {
        MessageForExceptions message = new MessageForExceptions();
        message.setMessage(personException.getMessage());

        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
