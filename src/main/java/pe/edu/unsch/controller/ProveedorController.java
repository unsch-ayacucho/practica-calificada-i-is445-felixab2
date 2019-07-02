package pe.edu.unsch.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pe.edu.unsch.entities.Proveedor;
import pe.edu.unsch.service.ProveedorService;

@RestController
public class ProveedorController {

	@Autowired
	protected ProveedorService SrvProveedor;
	
	@Autowired
	protected ObjectMapper objProveedor;
	
	 @RequestMapping(value = "/SaveOpdateProveedor", method = RequestMethod.POST)
	 public String GuardarProveedor(@RequestBody String jsonProveedor )
			 throws JsonParseException, JsonMappingException, IOException {
		 this.objProveedor = new ObjectMapper(); 
		 
		 Proveedor proveedor = this.objProveedor.readValue(jsonProveedor, Proveedor.class);
		 
		 this.SrvProveedor.SaveProveedor(proveedor);
		 return "Proveedor guardado";
	 }
}
