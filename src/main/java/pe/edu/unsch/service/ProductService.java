package pe.edu.unsch.service;

import java.util.List;

import pe.edu.unsch.entities.Producto;

public interface ProductService {
	Producto SaveProduct(Producto product);
	List<Producto> GetListaProducto();
}
