package fg.app.hotel.core.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String nameResource;
	private String idResource;
	
	public ResourceNotFoundException() {
		super();
	}

}
