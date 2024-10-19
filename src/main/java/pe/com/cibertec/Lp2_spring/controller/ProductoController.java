package pe.com.cibertec.Lp2_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.com.cibertec.Lp2_spring.model.entity.ProductoEntity;
import pe.com.cibertec.Lp2_spring.service.CategoriaService;
import pe.com.cibertec.Lp2_spring.service.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/")
	public String listaProductos(Model model) {
		List<ProductoEntity> listaProducto = productoService.listarProducto();
		model.addAttribute("listaprod", listaProducto);
		return "lista_producto";
	}
}
