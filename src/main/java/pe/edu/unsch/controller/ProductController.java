package pe.edu.unsch.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pe.edu.unsch.entities.Producto;
import pe.edu.unsch.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	protected ProductService SrvProduct;
	//convertir JSON en entitities y al reves
	@Autowired
	protected ObjectMapper objProducto;
	
	// @PostMapping("/SaveOpdateProducto")
    @RequestMapping(value = "/SaveOpdateProducto", method = RequestMethod.POST)
	public String GuardarProducto(@RequestBody String jsonProducto ) 
			throws JsonParseException, JsonMappingException, IOException {		
		this.objProducto = new ObjectMapper();
		
		Producto producto = this.objProducto.readValue(jsonProducto, Producto.class);
		
		
		// hacer validaciones
		
		
		// decimos para guardar		
		this.SrvProduct.SaveProduct(producto);
		return "producto guardado";
	}
    
    @GetMapping("/listaProductos")
    public List<Producto>  listaProductos(){
    	return this.SrvProduct.GetListaProducto();
    }
	
}
