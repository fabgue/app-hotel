package fg.app.usuarios.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "LOGIN", nullable = false)
	private String login;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	@Column(name = "CLAVE", nullable = false)
	private String clave;
	
}
