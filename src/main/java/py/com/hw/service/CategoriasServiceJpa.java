package py.com.hw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.com.hw.model.Categoria;
import py.com.hw.repository.CategoriasRepository;

@Service
public class CategoriasServiceJpa implements CategoriasService {

	@Autowired
	private CategoriasRepository categoriasRepo;
	
	@Override
	public List<Categoria> listarTodos() {
		// TODO Auto-generated method stub
		return categoriasRepo.findAll();
	}

}
