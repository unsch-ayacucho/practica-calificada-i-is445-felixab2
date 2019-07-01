package pe.edu.unsch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.ued.unsch.entities.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long>{
	
}
