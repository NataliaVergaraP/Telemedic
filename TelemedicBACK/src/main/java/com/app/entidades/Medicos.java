package com.app.entidades;

public class Medicos {
private long id;
private int id_medico;
private int tipo_documento;
private String nombre;
private String apellido;
private String email;
private String direccion;
private String Especialidad;
private String canal;
private int telefono;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getId_paciente() {
	return id_medico;
}
public void setId_paciente(int id_medico) {
	this.id_medico = id_medico;
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
public String getCanal() {
	return canal;
}
public void setCanal(String canal) {
	this.email = canal;
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
public String getEspecialidad() {
	return Especialidad;
}
public void setEspecialidad(String Especialidad) {
	this.Especialidad = direccion;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
@Override
public String toString() {
	return "Medicos [id=" + id + ", id_medico=" + id_medico + ", tipo_documento=" + tipo_documento + ", nombre="
			+ nombre + ", apellido=" + apellido + ", email=" + email + ", direccion=" + direccion + ", telefono="
			+ telefono + ", Especialidad=+"+ Especialidad + ", canal=+\"+ canal + \"]";
}
public Medicos(long id, int id_medico, int tipo_documento, String nombre, String apellido, String email, String canal, String Especialidad,
		String direccion, int telefono) {
	super();
	this.id = id;
	this.id_medico = id_medico;
	this.tipo_documento = tipo_documento;
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
	this.direccion = direccion;
	this.telefono = telefono;
	this.canal = direccion;
	this.Especialidad = Especialidad;
}
public Medicos() {
	super();
	// TODO Auto-generated constructor stub
}



}