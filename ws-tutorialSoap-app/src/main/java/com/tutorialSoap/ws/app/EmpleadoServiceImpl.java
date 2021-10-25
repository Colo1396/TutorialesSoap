package com.tutorialSoap.ws.app;

import javax.jws.*;

import com.tutorialSoap.ws.app.response.EmpleadoResponse;

@SuppressWarnings("restriction")
@WebService(endpointInterface="com.tutorialSoap.ws.app.EmpleadoService")
public class EmpleadoServiceImpl implements EmpleadoService{

	public String getEmpleadoById(int idEmpleado) {
		String resultado =(idEmpleado==10)?"Empleado encontrado":"Error";
		return resultado;
	}
	
	public EmpleadoResponse getEmpleadoByIdResponse(int idEmpleado) {
		EmpleadoResponse resultado =(idEmpleado==10)?
				new EmpleadoResponse.EmpleadoBuilder().codigo(100).descripcion("Empleado encontrado").build():
				new EmpleadoResponse.EmpleadoBuilder().codigo(-1).descripcion("Error").build();
		return resultado;
	}

}