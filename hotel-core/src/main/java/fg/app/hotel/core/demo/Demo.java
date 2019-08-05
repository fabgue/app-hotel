package fg.app.hotel.core.demo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DEMO")
public class Demo {
	
	@Id 
	@Type(type = "pg-uuid")
	@Column(name = "ID", nullable = false)
    private UUID id;

	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
}
