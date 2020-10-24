package com.iue.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBL_CORPORATION")
public class Corporationr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)   * Otras BD
	@GeneratedValue(  strategy= GenerationType.AUTO,   generator="native")
	@GenericGenerator( name = "native",  strategy = "native"  )
	@Column(name = "id")
	private long id;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nit")
	private String nit;
	
	@Column(name = "Tiposociedad")
	private String Tiposociedad;
	
	public String getTiposociedad() {
		return Tiposociedad;
	}

	public void setTiposociedad(String tiposociedad) {
		Tiposociedad = tiposociedad;
	}

	@Column(name = "razon_social")
	private String razonsocial;
	
	@Column(name = "telefono")
	private int telefono;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Corporation [id=" + id + ", direccion=" + Tiposociedad + ", email=" + email + ", email=" + email + ", nit=" + nit + ", razon_social=" + razonsocial + ", telefono=" + telefono + ", Tiposociedad=" + Tiposociedad + "]";
	}

	public Corporationr(long id, String direccion, String email, String nit, String razonsocial, String Tiposociedad, int telefono) {
		this.id = id;
		this.direccion = direccion;
		this.email = email;
		this.Tiposociedad = nit;
		this.razonsocial = razonsocial;
		this.telefono = telefono;
		this.Tiposociedad = Tiposociedad;
	}

	public Corporationr() {
		super();
		// TODO Auto-generated constructor stub
	}
}
