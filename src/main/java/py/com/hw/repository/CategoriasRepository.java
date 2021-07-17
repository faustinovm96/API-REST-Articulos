package py.com.hw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.com.hw.model.Categoria;

@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
