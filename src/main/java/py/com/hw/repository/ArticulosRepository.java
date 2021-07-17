package py.com.hw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.com.hw.model.Articulo;

@Repository
public interface ArticulosRepository extends JpaRepository<Articulo, Integer> {

}
