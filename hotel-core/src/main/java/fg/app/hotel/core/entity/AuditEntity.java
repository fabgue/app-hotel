package fg.app.hotel.core.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class AuditEntity {

	@JsonIgnore
    @Column(name = "FH_CREACION", nullable = false, updatable = false)
    @CreatedDate    
    private LocalDateTime fhCreacion;
 
	@JsonIgnore
    @Column(name = "FH_EDICION")
    @LastModifiedDate    
    private LocalDateTime fhEdicion;
    
	@JsonIgnore
    @Column(name = "USU_CREACION")
    @CreatedBy
    private String usuCreacion;
 
	@JsonIgnore
    @Column(name = "USU_EDICION")
    @LastModifiedBy
    private String usuEdicion;
	
}
