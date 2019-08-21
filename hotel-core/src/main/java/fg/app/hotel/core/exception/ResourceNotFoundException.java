package fg.app.hotel.core.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
		
	public ResourceNotFoundException(Class<?> clazz, Long resourceId) {
		super(ResourceNotFoundException.generateMessage(clazz, resourceId));
	}
	
	private static String generateMessage(Class<?> clazz, Long resourceId) {
		return String.format("Recurso no encontrado: %s = %d", clazz.getSimpleName(), resourceId);
	}

}
