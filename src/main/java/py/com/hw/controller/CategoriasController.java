package py.com.hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.com.hw.model.Categoria;
import py.com.hw.service.CategoriasService;

@RestController
@RequestMapping("/api")
public class CategoriasController {
	
	@Autowired
	private CategoriasService categoriasService;
	
	@GetMapping("/categorias")
	public List<Categoria> listarTodos() {
		return categoriasService.listarTodos();
	}
	
}
