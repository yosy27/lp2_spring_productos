package pe.com.cibertec.Lp2_spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.cibertec.Lp2_spring.model.entity.ProductoEntity;

public interface ProductoService {
	List<ProductoEntity>listarProducto();
	void crearProducto(ProductoEntity productoEntity);
	void actualizarProducto(Integer id, ProductoEntity productoEntity);
	void eliminarProducto(Integer id);
	//ver Detalle
}
