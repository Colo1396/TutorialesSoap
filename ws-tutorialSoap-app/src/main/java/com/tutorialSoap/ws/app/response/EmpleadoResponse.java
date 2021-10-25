package com.tutorialSoap.ws.app.response;

import java.io.Serializable;

public class EmpleadoResponse implements Serializable {

	private int codigo;
	private String descripcion;
	
	
	public EmpleadoResponse() {
	}
	
	public EmpleadoResponse(int codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "EmpleadoResponse [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	
	public static class EmpleadoBuilder { 
		private int codigo;
		private String descripcion;
		
		
		public EmpleadoBuilder() {}

		public EmpleadoBuilder codigo(int codigo) {
			this.codigo=codigo;
			return this;
		}
		
		public EmpleadoBuilder descripcion(String descripcion) {
			this.descripcion=descripcion;
			return this;
		}
		
		public EmpleadoResponse build() {
			EmpleadoResponse resp = new EmpleadoResponse();
			resp.codigo=this.codigo;
			resp.descripcion=this.descripcion;
			return resp;
		}
		
		
	}

}