package pe.edu.unsch.service;

import java.util.List;

import pe.edu.unsch.entities.Proveedor;

public interface ProveedorService {
	Proveedor SaveProveedor(Proveedor proveedor);
	List<Proveedor> GetListaProveedor();
}
