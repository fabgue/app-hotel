package fg.app.hotel.core.exception;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ApiError {
	
	private static final String DEFAULT_MESSAGE = "Error Interno";

    private HttpStatus status;
    private Integer statusCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private LocalDateTime timestamp;
    private String message;    
    private String errorId;
    private String detailMessage;

    private ApiError() {
    	timestamp = LocalDateTime.now();
    	errorId = String.valueOf(Timestamp.valueOf(timestamp).getTime());
    	message = ApiError.DEFAULT_MESSAGE;
    }
    
    public ApiError(HttpStatus status) {
        this();
        this.status = status;
        this.statusCode = status.value();
    }
  
    public ApiError(HttpStatus status, Throwable ex) {
    	this(status);
        this.message = ex.getMessage();
        this.detailMessage = ex.getClass().getSimpleName() + " : " + ex.getLocalizedMessage();
    }
  
    public ApiError(HttpStatus status, String message) {
        this(status);
        this.message = message;
        this.detailMessage = message;
    }    

    
}
