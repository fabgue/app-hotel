package fg.app.hotel.core.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    protected ResponseEntity<Object> defaultException(Exception ex, WebRequest request){
    	String errorId = String.valueOf(System.currentTimeMillis());
        String errorMessage = ex.getMessage();
        int errorCode = 500;
        String uriError = ((ServletWebRequest)request).getRequest().getRequestURL().toString();
        ErrorResponse errorResponse = new ErrorResponse();
        // LOGGER.error("Default Error msg: {}, requestUri: {}", ex.getMessage(), uriError);
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
    
}
