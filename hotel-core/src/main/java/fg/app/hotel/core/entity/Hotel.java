package fg.app.hotel.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "ID_HOTEL_CATEGORIA", nullable = false)
	private Long idHotelCategoria;
	
	@Column(name = "ID_LOCALIDAD", nullable = false)
	private Long idLocalidad;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "DIRECCION", nullable = false)
	private String direccion;
	
	@Column(name = "TELEFONO", nullable = false)
	private String telefono;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

	/*
	@ManyToOne
	@JoinColumn(name = "ID_HOTEL_CATEGORIA", referencedColumnName = "ID", updatable = false, insertable = false)
	private HotelCategoria hotelCategoria;
	*/
	/*
	@ManyToOne
	@JoinColumn(name = "ID_LOCALIDAD", referencedColumnName = "ID", updatable = false, insertable = false)
	private Localidad localidad;*/
	
}
