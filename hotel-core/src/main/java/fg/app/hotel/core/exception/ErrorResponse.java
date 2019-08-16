package fg.app.hotel.core.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

	private String messageCode;
	private String errorId;
	private String correlationId;
}
