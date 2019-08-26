package fg.app.hotel.core.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "All details about the Demo")
@Getter
@Setter
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "DEMO")
public class Demo extends AuditEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
		
	@ApiModelProperty(notes = "The database generated Demo UUID")
	@Type(type = "pg-uuid")
	@Column(name = "OBID", nullable = false)
    private UUID obid;	
	
	@Column(name = "ID_CIUDAD", nullable = false)
	private Long idCiudad;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", updatable = false, insertable = false)
	private Ciudad ciudad;
	    
	public Demo() {
		super();
		this.obid = UUID.randomUUID();
	}
	
}
