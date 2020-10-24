package com.iue.entidad;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.http.HttpHeaders;

@Entity
@Table(name = "TBL_AGENDA")
public class Agenda {

		@Id
		@GeneratedValue( strategy= GenerationType.AUTO, generator="native")
		@GenericGenerator( name = "native", strategy = "native")
		@Column( name= "id")
		private long id;
		
		@Column(name = "mes")
		private String mes;
		
		@Column(name = "dia")
		private int dia;
		
		@Column( name = "año")
		private int año;
		
		@Column( name = "hora")
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
			return "Agenda [id=" + id + ", mes=" + mes + ", dia=" + dia + ", año=" + año + ", hora=" + hora + "]";
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

		public void setAgendaList(ArrayList<Agenda> list) {
			// TODO Auto-generated method stub
			
		}

		public HttpHeaders getAgendaList() {
			// TODO Auto-generated method stub
			return null;
		}
		


}
