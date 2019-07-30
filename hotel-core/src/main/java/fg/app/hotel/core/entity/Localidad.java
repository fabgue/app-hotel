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
@Table(name = "LOCALIDAD")
public class Localidad {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "ID_REGION_CIUDAD", nullable = false)
	private Long idRegionCiudad;

	@Column(name = "ID_REGION_DEPTO", nullable = false)
	private Long idRegionDepto;

	@Column(name = "ID_REGION_PAIS", nullable = false)
	private Long idRegionPais;
	
}
