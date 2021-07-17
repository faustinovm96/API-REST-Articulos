package py.com.hw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.com.hw.model.Articulo;
import py.com.hw.repository.ArticulosRepository;

@Service
public class ArticulosServiceJpa implements IArticulosService {
	
	@Autowired
	private ArticulosRepository articulosRepo;
	
	@Override
	public List<Articulo> listarTodos() {
		// TODO Auto-generated method stub
		return articulosRepo.findAll();
	}

}
