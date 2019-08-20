package fg.app.hotel.core.exception;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

	private Long errorId;
	private String message;
	private String messageCode; // i18n
	private List<String> messageParams;
	private Integer statusCode;
	// private String correlationId;

	public ErrorResponse() {
	}

	public ErrorResponse(String errorCode, String errorId) {
		this(errorCode, errorId, null, null);
	}
	
	public ErrorResponse(String errorCode, String errorId, String correlationId) {
		this(errorCode, errorId, correlationId, null);
	}
	
	public ErrorResponse(String errorCode, String errorId, String correlationId, List<String> messageParams) {
		this(); /*
		this.errorCode = errorCode;
		this.errorId = errorId;
		this.correlationId = correlationId;
		this.messageParams = messageParams; */
	}

	
	
}
