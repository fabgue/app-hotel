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

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    protected ResponseEntity<Object> handleRuntimeException(RuntimeException ex, WebRequest request){
    	String errorId = String.valueOf(System.currentTimeMillis());
        String uriError = ((ServletWebRequest)request).getRequest().getRequestURL().toString();
        ApiError apiError = new ApiError(errorId,  HttpStatus.INTERNAL_SERVER_ERROR, ex);
        logger.error(String.format("Exception: uri = %s, erro r= %s", uriError, apiError), ex);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
	
    @ExceptionHandler(value = ResourceNotFoundException.class) 
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    protected ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
    	String errorId = String.valueOf(System.currentTimeMillis());
        //String uriError = ((ServletWebRequest)request).getRequest().getRequestURL().toString();
    	String uriError = ((ServletWebRequest)request).getRequest().getServletPath();
        ApiError apiError = new ApiError(errorId,  HttpStatus.NOT_FOUND, ex);
        logger.warn("resourceNotFoundException: uri = {}, {}", uriError, ex.getMessage());
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
    
}
