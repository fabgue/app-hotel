package fg.app.hotel.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "descripcion")
	private String descripcion;
	// localidad
	// categoria

		
	public Hotel(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Hotel() {
		super();
	}
	
	
}
