package pe.com.cibertec.Lp2_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.Lp2_spring.model.entity.CategoriaEntity;
import pe.com.cibertec.Lp2_spring.model.entity.ProductoEntity;
import pe.com.cibertec.Lp2_spring.service.CategoriaService;
import pe.com.cibertec.Lp2_spring.service.ProductoService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/productos")
public class ProductoController {

	private final ProductoService productoService;
	
	private final CategoriaService categoriaService;
	
	@GetMapping("/")
	public String listaProductos(Model model) {
		List<ProductoEntity> listaProducto = productoService.listarProducto();
		model.addAttribute("listaprod", listaProducto);
		return "lista_producto";
	}
	
	@GetMapping("/registrar_producto")
	public String mostrarRegistrarProducto(Model model) {
		List<CategoriaEntity>listaCategoria =  categoriaService.obtenerTodasCategorias();
		model.addAttribute("categorias", listaCategoria);
		model.addAttribute("producto", new ProductoEntity());
		return "registrar_producto";
	}
	
	@PostMapping("registrar_producto")
	public String registrarProducto(@ModelAttribute("producto")ProductoEntity productoEntity,
			Model model) {
		productoService.crearProducto(productoEntity);
		return "redirect:/productos/";
	}
		
}
