package fg.app.hotel.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@Column(name = "ID_CIUDAD", nullable = false)
	private Long idCiudad;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "DIRECCION", nullable = false)
	private String direccion;
	
	@Column(name = "TELEFONO", nullable = false)
	private String telefono;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_HOTEL_CATEGORIA", referencedColumnName = "ID", updatable = false, insertable = false)
	private HotelCategoria hotelCategoria;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", updatable = false, insertable = false)
	private Ciudad ciudad;
	
}
