package fg.app.usuarios.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UsuarioDto {
	
	private Long id;
	private String login;
	private String email;
	private String nombre;
	private String clave;
	private String claveConfirmacion;

}
