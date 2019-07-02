package pe.edu.unsch.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.ProveedorDAO;
import pe.edu.unsch.entities.Proveedor;
import pe.edu.unsch.service.ProveedorService;

@Service
public class ProveedorSrvImplement implements ProveedorService{
	
	@Autowired
	protected ProveedorDAO DaoProveedor;

	@Override
	public Proveedor SaveProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return this.DaoProveedor.save(proveedor);
	}

	@Override
	public List<Proveedor> GetListaProveedor() {
		// TODO Auto-generated method stub
		return this.DaoProveedor.findAll();
	}
	
	
}
