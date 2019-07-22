package fg.app.hotel.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HOTEL")
public class Hotel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_HOTEL")
	private Long idHotel;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "LOCALIDAD")
	private String localidad;
	
	@Column(name = "HOTEL_CATEGORIA")
	private String hotelCategoria;

}
