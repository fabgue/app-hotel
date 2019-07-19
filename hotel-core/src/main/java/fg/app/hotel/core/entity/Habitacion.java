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
@Table(name = "habitacion")
public class Habitacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
		
	@Column(name = "id_hotel")
	private Long idHotel;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "num_piso")
	private Integer numPiso;
	
	@Column(name = "habitacion_tipo")
	private String habitacionTipo;
	
	@Column(name = "num_personas")
	private Integer numPersonas;
	
	
}
