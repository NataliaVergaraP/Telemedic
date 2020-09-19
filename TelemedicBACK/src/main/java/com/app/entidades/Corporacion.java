package com.app.entidades;

public class Corporacion {
private long id;
private int id_corporacion;
private String razon_social;
private String direccion;
private String email;
private String Tiposociedad;
private int NIT;
private int telefono;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getId_corporacion() {
	return id_corporacion;
}
public void setId_corporacion(int id_medico) {
	this.id_corporacion = id_medico;
}
public String getRazon_social() {
	return razon_social;
}
public void setRazon_social(String razon_social) {
	this.razon_social = razon_social;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
public int getNIT() {
	return NIT;
}
public void setNIT(int nIT) {
	NIT = nIT;
}
public String getTiposociedad() {
	return Tiposociedad;
}
public void setTiposociedad(String tiposociedad) {
	Tiposociedad = tiposociedad;
}
@Override
public String toString() {
	return "Corporaciones [id=" + id + ", id_medico=" + id_corporacion + ", razon_social=" + razon_social + ", NIT="
			+ NIT + ", email=" + email + ", direccion=" + direccion + ", telefono="
			+ telefono + ", NIT=+\"+ NIT + \"]";
}
public Corporacion(long id, int id_medico, int tipo_documento, int NIT, String email,
		String direccion, int telefono, String razon_social, String Tiposociedad) {
	super();
	this.id = id;
	this.id_corporacion = id_medico;
	this.razon_social = razon_social;
	this.Tiposociedad = Tiposociedad;
	this.email = email;
	this.direccion = direccion;
	this.telefono = telefono;
	this.NIT = NIT;
}
public Corporacion() {
	super();
	// TODO Auto-generated constructor stub
}




}