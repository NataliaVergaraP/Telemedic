// Prueba de versionamiento.

package com.app.entidades;

public class Eps {
	private long id;
	private int id_eps;
	private String nombre;
	private String sede;
	private String direccion;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getId_eps() {
		return id_eps;
	}
	public void setId_eps(int id_eps) {
		this.id_eps = id_eps;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	private int telefono;

@Override
public String toString() {
	return "Eps [id=" + id + ", id_eps=" + id_eps + ", nombre=" + nombre + ", sede="
			+ sede + ",direccion=" + direccion + ", telefono=" + telefono + "]";
}

public Eps(long id, int id_eps, String nombre, String sede, String direccion, int telefono) {
	super();
	this.id = id;
	this.id_eps = id_eps;
	this.nombre = nombre;
	this.sede = sede;
	this.direccion = direccion;
	this.telefono = telefono;
}
public Eps() {
	super();
	// TODO Auto-generated constructor stub
}
}

