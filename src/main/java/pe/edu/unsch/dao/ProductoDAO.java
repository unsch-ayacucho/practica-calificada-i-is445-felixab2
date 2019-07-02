package pe.edu.unsch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.unsch.entities.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long>{
	
}
