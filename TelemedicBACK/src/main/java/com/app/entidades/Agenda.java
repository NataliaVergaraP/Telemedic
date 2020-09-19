package com.app.entidades;

public class Agenda {
	private long id;
	private String mes;
	private int dia;
	private int año;
	private int hora;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}


@Override
public String toString() {
	return "Agenda [id=" + id + ", mes=" + mes + ", dia=" + dia + ", año="
			+ año + ", hora=" + hora +  "]";
}
public Agenda(long id, String mes, int dia, int año, int hora) {
	super();
	this.id = id;
	this.mes = mes;
	this.dia = dia;
	this.año = año;
	this.hora = hora;
}
public Agenda() {
	super();
	// TODO Auto-generated constructor stub
}
}
