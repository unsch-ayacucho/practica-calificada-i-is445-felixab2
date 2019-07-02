package pe.edu.unsch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.unsch.entities.Proveedor;

public interface ProveedorDAO extends JpaRepository<Proveedor, Long> {

}
