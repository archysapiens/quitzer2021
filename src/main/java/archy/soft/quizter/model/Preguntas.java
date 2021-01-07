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
@Table(name = "preguntas")
public class Preguntas {
	
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int preguntas_id;
	@Column
	private String pregunta;
	@Column
    private int tipo_respuesta;
	@Column
	private String status;
	@Column
	@Temporal(TemporalType.DATE)
	private Date fecha_actualizacion;
	@ManyToOne
	@JoinColumn(name = "tema_id")
	Tema tema;
	
	@ManyToOne
    @JoinColumn(name = "users_id")
    users users; 
	
	
	public int getId() {
		return preguntas_id;
	}
	public void setId(int preguntas_id) {
		this.preguntas_id = preguntas_id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public int getTipo_respuesta() {
		return tipo_respuesta;
	}
	public void setTipo_respuesta(int tipo_respuesta) {
		this.tipo_respuesta = tipo_respuesta;
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
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public users getUsers() {
		return users;
	}
	public void setUsers(users users) {
		this.users = users;
	}
	

	     
	
	
}