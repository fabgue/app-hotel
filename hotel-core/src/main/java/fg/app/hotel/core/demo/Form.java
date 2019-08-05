package fg.app.hotel.core.demo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "FORM")
public class Form {
	
	@Id 
	@Type(type = "pg-uuid")
	@Column(name = "ID", nullable = false)
    private UUID id;	

	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	public Form() {
		super();
		this.id = UUID.randomUUID();
	}
	
	
	
}
