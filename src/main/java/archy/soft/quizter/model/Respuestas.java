package archy.soft.quizter.model;


import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "respuestas")
public class Respuestas {
	
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_respuesta;
	@Column
	private String opcion;
	@Column
	private String tipo_opcion;
	@Column
	private String status;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha_actualizacion;  
	@ManyToOne
	@JoinColumn(name = "preguntas_id")
	Preguntas preguntas;
	public int getId_respuesta() {
		return id_respuesta;
	}
	public void setId_respuesta(int id_respuesta) {
		this.id_respuesta = id_respuesta;
	}
	public String getOpcion() {
		return opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	public String getTipo_opcion() {
		return tipo_opcion;
	}
	public void setTipo_opcion(String tipo_opcion) {
		this.tipo_opcion = tipo_opcion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getFecha_actualizacion() {
		return fecha_actualizacion;
	}
	public void setFecha_actualizacion(Date fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	public Preguntas getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(Preguntas preguntas) {
		this.preguntas = preguntas;
	}	

}
