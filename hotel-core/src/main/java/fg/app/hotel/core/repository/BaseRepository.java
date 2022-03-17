package fg.app.hotel.core.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    void delete(T deleted);
    
    List<T> findAll();
     
    Optional<T> findOne(ID id);
 
    <S extends T> S save(S persisted);
    
    Page<T>	findAll(Pageable pageable);
    
}
