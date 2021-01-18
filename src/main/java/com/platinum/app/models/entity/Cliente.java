package com.platinum.app.models.entity;



import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
//@Entity
//@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@SequenceGenerator(name="CLIENTE_IDCLIENTE_GENERATOR", sequenceName="ORDER_SEQUENCE")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENTE_IDCLIENTE_GENERATOR")
//	private int idCliente;
//
//	private String apellido;
//
//	private String correo;
//
//	private String direccion;
//
//	private String nombre;
//
//	private String telefono;
//
//	//bi-directional many-to-one association to Ctacorriente
//	@OneToMany(mappedBy="cliente")
//	private List<Ctacorriente> ctacorrientes;
//
//	public Cliente() {
//	}
//
//	public int getIdCliente() {
//		return this.idCliente;
//	}
//
//	public void setIdCliente(int idCliente) {
//		this.idCliente = idCliente;
//	}
//
//	public String getApellido() {
//		return this.apellido;
//	}
//
//	public void setApellido(String apellido) {
//		this.apellido = apellido;
//	}
//
//	public String getCorreo() {
//		return this.correo;
//	}
//
//	public void setCorreo(String correo) {
//		this.correo = correo;
//	}
//
//	public String getDireccion() {
//		return this.direccion;
//	}
//
//	public void setDireccion(String direccion) {
//		this.direccion = direccion;
//	}
//
//	public String getNombre() {
//		return this.nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public String getTelefono() {
//		return this.telefono;
//	}
//
//	public void setTelefono(String telefono) {
//		this.telefono = telefono;
//	}
//
//	public List<Ctacorriente> getCtacorrientes() {
//		return this.ctacorrientes;
//	}
//
//	public void setCtacorrientes(List<Ctacorriente> ctacorrientes) {
//		this.ctacorrientes = ctacorrientes;
//	}
//
//	public Ctacorriente addCtacorriente(Ctacorriente ctacorriente) {
//		getCtacorrientes().add(ctacorriente);
//		ctacorriente.setCliente(this);
//
//		return ctacorriente;
//	}
//
//	public Ctacorriente removeCtacorriente(Ctacorriente ctacorriente) {
//		getCtacorrientes().remove(ctacorriente);
//		ctacorriente.setCliente(null);
//
//		return ctacorriente;
//	}

}