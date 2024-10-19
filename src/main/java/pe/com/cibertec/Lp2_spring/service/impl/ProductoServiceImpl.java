package pe.com.cibertec.Lp2_spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.Lp2_spring.model.entity.ProductoEntity;
import pe.com.cibertec.Lp2_spring.repository.ProductoRepository;
import pe.com.cibertec.Lp2_spring.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	
	@Override
	public List<ProductoEntity> listarProducto() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public void crearProducto(ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizProducto(Integer id, ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
