package com.app.entidades;

public class Pacientes {
private long id;
private int id_paciente;
private int tipo_documento;
private String nombre;
private String apellido;
private String email;
private String direccion;
private int telefono;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getId_paciente() {
	return id_paciente;
}
public void setId_paciente(int id_paciente) {
	this.id_paciente = id_paciente;
}
public int getTipo_documento() {
	return tipo_documento;
}
public void setTipo_documento(int tipo_documento) {
	this.tipo_documento = tipo_documento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
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
@Override
public String toString() {
	return "Pacientes [id=" + id + ", id_paciente=" + id_paciente + ", tipo_documento=" + tipo_documento + ", nombre="
			+ nombre + ", apellido=" + apellido + ", email=" + email + ", direccion=" + direccion + ", telefono="
			+ telefono + "]";
}
public Pacientes(long id, int id_paciente, int tipo_documento, String nombre, String apellido, String email,
		String direccion, int telefono) {
	super();
	this.id = id;
	this.id_paciente = id_paciente;
	this.tipo_documento = tipo_documento;
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
	this.direccion = direccion;
	this.telefono = telefono;
}
public Pacientes() {
	super();
	// TODO Auto-generated constructor stub
}



}
