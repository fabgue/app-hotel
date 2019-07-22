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
@Table(name = "HABITACION")
public class Habitacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_HABITACION")
	private Long idHabitacion;
		
	@Column(name = "ID_HOTEL")
	private Long idHotel;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "NUM_PISO")
	private Integer numPiso;
	
	@Column(name = "HABITACION_TIPO")
	private String habitacionTipo;
	
	@Column(name = "NUM_PERSONAS")
	private Integer numPersonas;
	
	
}
