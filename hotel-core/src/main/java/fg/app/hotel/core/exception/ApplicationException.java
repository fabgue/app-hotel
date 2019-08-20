package fg.app.hotel.core.exception;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	
	public ApplicationException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public ApplicationException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public ApplicationException(Throwable cause, String errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}
	
}
