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
@Table(name = "HABITACION")
public class Habitacion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
		
	@Column(name = "ID_HOTEL", nullable = false)
	private Long idHotel;
	
	@Column(name = "ID_HABITACION_TIPO", nullable = false)
	private Long idHabitacionTipo;
	
	@Column(name = "NUMERO", nullable = false)
	private String numero;
	
	@Column(name = "PISO", nullable = false)
	private Integer piso;
		
	@ManyToOne
	@JoinColumn(name = "ID_HABITACION_TIPO", referencedColumnName = "ID" , updatable = false, insertable = false)
	private HabitacionTipo HabitacionTipo;
	
		
}
