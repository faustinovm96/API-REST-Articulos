package py.com.hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.com.hw.model.Articulo;
import py.com.hw.service.IArticulosService;

@RestController
@RequestMapping("/api")
public class ArticulosController {
	
	@Autowired
	private IArticulosService articulosService;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articulosService.listarTodos(); 
	}
	
}
