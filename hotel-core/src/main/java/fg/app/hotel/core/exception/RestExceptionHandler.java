package fg.app.hotel.core.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    protected ResponseEntity<Object> handleGeneralException(Exception ex, WebRequest request) {
    	logger.info("Inicio handleGeneralException");
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
        String errorId = apiError.getErrorId();
        String errorUri = ((ServletWebRequest)request).getRequest().getRequestURL().toString();
        String message = ex.getClass().getSimpleName() + " : " + ex.getLocalizedMessage();
        logger.error("Exception: errorId={}, errorUri={}, message=[{}]", errorId, errorUri, message, ex);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
	
    @ExceptionHandler(value = ResourceNotFoundException.class) 
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    protected ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
    	logger.info("Inicio handleResourceNotFoundException");
    	ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, ex);
    	String errorId = apiError.getErrorId();
    	String message = apiError.getDetailMessage();
    	String errorUri = ((ServletWebRequest)request).getRequest().getRequestURI();        
        logger.warn("ResourceNotFoundException: errorId={}, message=[{}], errorUri={}", errorId, message, errorUri);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
    
}
