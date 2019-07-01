package pe.ued.unsch.entities;
// Generated 25/06/2019 05:07:03 PM by Hibernate Tools 5.3.0.Beta2

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Proveedor generated by hbm2java
 */
@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Long idproveedor;
	private String nombreproveedor;
	private String ruc;
	private String direccion;

	public Proveedor() {
	}

	public Proveedor(String nombreproveedor, String ruc, String direccion) {
		this.nombreproveedor = nombreproveedor;
		this.ruc = ruc;
		this.direccion = direccion;
	}

	public Long getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(Long idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getNombreproveedor() {
		return this.nombreproveedor;
	}

	public void setNombreproveedor(String nombreproveedor) {
		this.nombreproveedor = nombreproveedor;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
