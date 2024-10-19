package pe.com.cibertec.Lp2_spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.Lp2_spring.model.entity.CategoriaEntity;
import pe.com.cibertec.Lp2_spring.repository.CategoriaRepository;
import pe.com.cibertec.Lp2_spring.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Override
	public List<CategoriaEntity> obtenerTodasCategorias() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
