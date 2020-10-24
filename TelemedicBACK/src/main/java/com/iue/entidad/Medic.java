package com.iue.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBL_MEDICOS")
public class Medic  implements Serializable {
private static final long serialVersionUID = 1L;

@Id
//@GeneratedValue(strategy = GenerationType.AUTO)   * Otras BD
@GeneratedValue(  strategy= GenerationType.AUTO,   generator="native")
@GenericGenerator( name = "native",  strategy = "native"  )
@Column(name = "id_medico")
private int id_medico;

@Column(name = "tipo_documento")
private int tipo_documento;

@Column(name = "nombre")
private String nombre;

@Column(name = "apellido")
private String apellido;

@Column(name = "email")
private String email;

@Column(name = "direccion")
private String direccion;

@Column(name = "Especialidad")
private String Especialidad;

@Column(name = "canal")
private String canal;

@Column(name = "telefono")
private int telefono;


public long getId_paciente() {
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
	return "Medicos [id_medico=" + id_medico + ", tipo_documento=" + tipo_documento + ", nombre="
			+ nombre + ", apellido=" + apellido + ", email=" + email + ", direccion=" + direccion + ", telefono="
			+ telefono + ", Especialidad=+"+ Especialidad + ", canal=+\"+ canal + \"]";
}
public Medic(int id_medico, int tipo_documento, String nombre, String apellido, String email, String canal, String Especialidad,
		String direccion, int telefono) {
	super();
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
public Medic() {
	super();
	// TODO Auto-generated constructor stub
}
public void setMedicList(ArrayList<Medic> list) {
	// TODO Auto-generated method stub
	
}
public Map<String, ?> getId() {
	// TODO Auto-generated method stub
	return null;
}



}