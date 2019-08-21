package fg.app.hotel.core.exception;

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

    private HttpStatus status;
    private Integer codeStatus;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private LocalDateTime timestamp;
    private String message;    
    private String errorId;
    private String detailMessage;

    private ApiError() {
    	timestamp = LocalDateTime.now();
    }
    
    public ApiError(String errorId, HttpStatus status) {
        this();
        this.errorId = errorId;
        this.status = status;
        this.codeStatus = status.value();
    }
  
    public ApiError(String errorId, HttpStatus status, Throwable ex) {
        this(errorId, status);
        this.message = ex.getLocalizedMessage();
    }
  
    public ApiError(String errorId, HttpStatus status, String message) {
        this(errorId, status);
        this.message = message;
    }    

    
}
