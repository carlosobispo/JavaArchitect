package edu.demo.rsws.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Cobispo
 *
 */
@XmlRootElement
public class Programa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nombre;
	
	public Programa(){
		
	}
	
	public Programa(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
