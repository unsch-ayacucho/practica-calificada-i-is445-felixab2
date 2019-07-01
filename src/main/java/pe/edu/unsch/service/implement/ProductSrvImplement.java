package pe.edu.unsch.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.ProductoDAO;
import pe.edu.unsch.service.ProductService;
import pe.ued.unsch.entities.Producto;

@Service
public class ProductSrvImplement implements ProductService{

	@Autowired
	protected ProductoDAO DaoProduct;

	

	@Override
	public List<Producto> GetListaProducto() {
		
		return this.DaoProduct.findAll();
	}



	@Override
	public Producto SaveProduct(Producto product) {
		// TODO Auto-generated method stub		
		
		return this.DaoProduct.save(product);
	}
	
}
